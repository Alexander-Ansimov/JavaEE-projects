package ua.org.oa.ansimov;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class UtilParserSax{	
	
	
	public static void parseBySax() {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			SaxHandler handler = new SaxHandler();
			
			parser.parse("XML_for_parsing.xml", handler);			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}		
	}

}
