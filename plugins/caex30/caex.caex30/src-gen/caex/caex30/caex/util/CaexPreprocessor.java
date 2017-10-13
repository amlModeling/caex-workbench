/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
package caex.caex30.caex.util;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CaexPreprocessor {

	public static void removeAdditionalInformation(String filename) throws Exception {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//parse file
		Document doc = db.parse(new FileInputStream(new File(filename)));
		
		//remove all 'AdditionalInformation' elements
		Element element = (Element)doc.getElementsByTagName("AdditionalInformation").item(0);
		while(element!=null){
			element.getParentNode().removeChild(element);
			element = (Element)doc.getElementsByTagName("AdditionalInformation").item(0);
		}

		//save dom back to file
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult streamResult =  new StreamResult(new File(filename));
		transformer.transform(source, streamResult);
		
	}	
}
