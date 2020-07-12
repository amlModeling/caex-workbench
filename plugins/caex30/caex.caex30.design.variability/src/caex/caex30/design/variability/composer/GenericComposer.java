package caex.caex30.design.variability.composer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import caex.caex30.design.variability.utils.EMFHandler;
import de.ovgu.featureide.core.IFeatureProject;
import de.ovgu.featureide.core.builder.ComposerExtensionClass;
import de.ovgu.featureide.fm.core.ExtensionManager.NoSuchExtensionException;
import de.ovgu.featureide.fm.core.base.impl.ConfigFormatManager;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.DefaultFormat;
import de.ovgu.featureide.fm.core.io.IPersistentFormat;
import de.ovgu.featureide.fm.core.io.manager.SimpleFileHandler;
import pcdef.PCDiagramDefinition;
import variability.Variability;

public class GenericComposer extends ComposerExtensionClass {
	
	private static final String modelExtensions = "caex";
	private static final String annotExtension = ".vrb";
	private static final String PC_URI = "/caex.caex30.design/description/feature-caex30.pcdef";

	private File net, annot;
	private Resource genericResource, annResource;
	private EMFHandler emh = null;
	private Variability vRoot = null;
	private PCDiagramDefinition pcDiagramDefinition = null;
	
	public GenericComposer() {
		System.out.println("[ caex PLs] Initializing (constructor)");
		this.removeJavaNature();
	}
		
	public GenericComposer(Variability vrb) {
		System.out.println("[ caex PLs] Initializing (constructor)");
		this.removeJavaNature(); 
		this.vRoot = vrb;
	}
	
	private void findFiles()  {
		if (net == null) {
			IProject pr = this.featureProject.getProject();
			try {
				for (IResource res : pr.members()) {
					if (validModelExtension(res.getFileExtension())) {
						net = res.getLocation().toFile();
						System.out.println("[ caex PLs] Processing file: "+(net == null ? "none" : this.net.getName()));
					}
					if (res.getName().endsWith(annotExtension)) {
						annot = res.getLocation().toFile();
						System.out.println("[ caex PLs] Annotation file: "+(net == null ? "none" : this.annot.getName()));
					}
					if (this.net != null && this.annot != null)
						break;
				}
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
	}	
	
	private boolean validModelExtension(String fileExtension) {
		String pattern = ".*" + fileExtension + ".*";		
		return Pattern.matches(pattern, modelExtensions);
	}
	
	public void performFullBuild(IFile config) {		
		System.out.println("[ caex PLs] Full build" + config.getFullPath());
		this.removeJavaNature();
		this.findFiles();
	}
	
	@Override
	public void buildConfiguration(IFolder folder, Configuration configuration, String cfgName) {
		this.findFiles();
		System.out.println("[ caex PLs] Selected features = " + configuration.getSelectedFeatureNames());
		if (this.isInitialized())		
			super.buildConfiguration(folder, configuration, cfgName);
		else
			this.persistConfig(folder, configuration, cfgName);
		genModel(folder, configuration);
	}
	
	private void genModel(IFolder folder, Configuration config) {	
		this.loadModels();
		String fileName = this.net.getName();
		URI uri = URI.createFileURI(new File(folder.getLocation().toOSString()+File.separator+fileName).getAbsolutePath());
		FeatureIDEProvider fip = new FeatureIDEProvider(config);
		Resource newr = this.genericResource.getResourceSet().createResource(uri);
		if (this.emh==null) this.emh = new EMFHandler();
		CopierModelConfiguration copier = new CopierModelConfiguration(vRoot, fip, this.emh,null);
		Collection<EObject> copyModel = copier.copyAll(this.genericResource.getContents());
		copier.copyReferences();
		newr.getContents().addAll(copyModel);		
		try {
			newr.save(null);
		} catch (IOException e) {
			System.err.println("[ petrinets pn PLs] Error saving file" + uri);
		}		
		System.out.println("[ petrinets pn PLs] saved model " + uri);		
	}
	
	private void removeJavaNature() {
			if (this.featureProject == null) return;
			IProject pr = this.featureProject.getProject();
			System.out.println("[merlin] removing Java nature of project "+pr);
			try {
				if (pr.hasNature(JAVA_NATURE)) {
					IProjectDescription desc = pr.getDescription();
				    String[] prevNatures = desc.getNatureIds();
					String[] newNatures = new String[prevNatures.length - 1];
					int idx = 0;
					for (int i = 0; i<prevNatures.length; i++) {
						if (!JAVA_NATURE.equals(prevNatures[i])) newNatures[idx++] = prevNatures[i];
					}
				    desc.setNatureIds(newNatures);
				    pr.setDescription(desc, new NullProgressMonitor());
				}			
			} catch (CoreException e) {
				e.printStackTrace();
			}
	}
	
	public boolean initialize(IFeatureProject project) {
		boolean ret = super.initialize(project);
		System.out.println("[ caex PLs] initialize project");
		this.removeJavaNature();			
		return ret;
	}
	
	private void loadModels() {
		if (this.genericResource == null) {
			if (this.emh==null) this.emh = new EMFHandler();
			this.genericResource = this.emh.loadModel(this.net);
			this.annResource = this.emh.loadXtextModel(this.annot);			
			if (this.vRoot==null) this.vRoot = (Variability)this.annResource.getContents().get(0);
			if (this.pcDiagramDefinition == null) this.pcDiagramDefinition = (PCDiagramDefinition) this.emh.
					getResourceFromURI(URI.createPlatformPluginURI(PC_URI, false)).getContents().get(0);
			EcoreUtil.resolveAll(vRoot);			
		}
	}	
	
	private void persistConfig(IFolder folder, Configuration configuration, String cfgName) {
		IPersistentFormat<Configuration> format;
		try {
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
			format = ConfigFormatManager.getInstance().getFormatById(DefaultFormat.ID);
			final IFile configurationFile = folder.getFile(cfgName + "." + format.getSuffix());
			SimpleFileHandler.save(Paths.get(configurationFile.getLocationURI()), configuration, format);
		} catch (NoSuchExtensionException | CoreException e) {
			System.err.println("[ caex PLs] error saving configuration file to "+folder);
		}		
	}
	
	@Override
	public boolean hasSourceFolder() {
		return false;
	}
	
	@Override
	public boolean hasFeatureFolder() {
		return false;
	}
	
	@Override
	public boolean canGeneratInParallelJobs() {
		return false;
	}

	@Override
	public void performFullBuild(Path config) {
		// Do nothing		
	}

}
