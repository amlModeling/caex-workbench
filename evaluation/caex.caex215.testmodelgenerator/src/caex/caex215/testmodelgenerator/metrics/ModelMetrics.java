package caex.caex215.testmodelgenerator.metrics;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import caex.caex215.caex.CAEXFile;
import caex.caex215.caex.CAEXPackage;

public class ModelMetrics {

	public void generateMetrics(String baseModel) {
		CAEXPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI
                        .createURI(baseModel), true);
        CAEXFile model = (CAEXFile) resource.getContents().get(0);
        
        TreeIterator<EObject> ti = model.eAllContents();
        
        int i = 0;
        while (ti.hasNext()){
        	ti.next();
	        i++;
        }
        
        System.out.println("Model " + baseModel + " has " + i + " model elements.");
	}

}
