package caex.caex30.design.variability.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import pnpl_variability.PNPL_variabilityRuntimeModule;

public class EMFHandler {
	private ResourceSet rs;
	private Injector injector;
	
	public EMFHandler() {
		injector = Guice.createInjector(new PNPL_variabilityRuntimeModule());
		rs = injector.getInstance(XtextResourceSet.class);		
		((XtextResourceSet)rs).addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}	
	
	public Resource loadModel(File model) {		
		Resource resource = getResourceFromFile(model);
		return resource;
	}

	public Resource loadXtextModel(File model) {
		Resource resource = getResourceFromFile(model);
		InputStream in;
		try {
			in = new FileInputStream(model);
			resource.load(in, rs.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}		
		return resource;
	}

	private Resource getResourceFromFile (File model) {
		IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(Path.fromOSString(model.getAbsolutePath()));
		return rs.getResource(URI.createPlatformResourceURI(iFile.getFullPath().toString(), true), true);
	}
	
	public Resource getResourceFromURI(URI uri) {		
		return rs.getResource(uri, true);
	}

	public String object2xtext (EObject eobj) {
		Serializer serializer = injector.getInstance(Serializer.class);  
		return serializer.serialize(eobj);
	}
	
	public void removeAllPNObjects(Resource newr, List<EObject> toDelete) {
		EcoreUtil.removeAll(toDelete);		
	}
}

