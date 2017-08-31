package caex.caex215.testmodelgenerator.generator;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.CAEXFile;
import caex.caex215.caex.InstanceHierarchy;
import caex.caex215.caex.InternalElement;

public class ModelEnlarger {

	public void generateClones(String baseModel, int number) {
        CAEXPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // base model which should be cloned
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI
                        .createURI(baseModel), true);
        CAEXFile model = (CAEXFile) resource.getContents().get(0);
        
        // create clone template
        InstanceHierarchy hierarchy = model.getInstanceHierarchy().get(0);
        InternalElement prototype = hierarchy.getInternalElement().get(0);
        EcoreUtil.Copier copier = new EcoreUtil.Copier();

        int i = 0;
        while (i < number){
        	InternalElement clone = (InternalElement) copier.copy(prototype);
	        copier.copyReferences();
        	clone.setID(i+"");
        	clone.setName(i+"");
	        hierarchy.getInternalElement().add(clone);
	        i++;
        }
        
        // create cloned model        
        URI uri = URI.createURI(baseModel).trimFileExtension().appendFileExtension(number+".xmi");
        resource = resSet.createResource(uri);
		resource.getContents().add(model);
		
		try {
		        resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		        e.printStackTrace();
		}
	}
}
