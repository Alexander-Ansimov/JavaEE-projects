package ua.org.oa.ansimov;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UtilParserDom {
	
	public static Shop parseToObjectByDom() {
		
		File file = new File("XML_for_parsing.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			NodeList nodeList = doc.getChildNodes();
			System.out.println(nodeList.item(0).getNodeName());
			NodeList nodeList2 = nodeList.item(0).getChildNodes();
			
			for (int i = 0; i < nodeList2.getLength(); i++) {
				System.out.println("FF "+nodeList2.item(i).getNodeName());
				NodeList nodeList3 = nodeList2.item(i).getChildNodes();
			}
			
	//		NodeList nodeList3 = nodeList2.item(index)
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		} 
		
		return null;		
	}

}
