package caex.caex30.design.variability.utils;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FeatureUtils {
	
	public static final String FILE_URI_FEATURE_MODEL = "model.xml";
	
	public static NodeList getFeaturesContainerURI(URI containerURI) {
		URI featureModelUri = containerURI.appendSegment(FeatureUtils.FILE_URI_FEATURE_MODEL);	
		return getFeatures(featureModelUri);
	}
	
	public static NodeList getFeatures(URI featureModelUri) {
		try {
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(featureModelUri.toString());
			doc.getDocumentElement().normalize();
		    NodeList features = doc.getElementsByTagName("feature");
		    return features;
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		return null;		
	}
	
	public static boolean existFeature(String feature, NodeList features) {
		boolean valid = false;
		for (int i = 0; ((i < features.getLength()) && (valid == false)); i++) {
			if (feature.equals(features.item(i).getAttributes().getNamedItem("name").getNodeValue())) {
				valid = true;
			}		   
		}
		return valid;
	} 
	
}

