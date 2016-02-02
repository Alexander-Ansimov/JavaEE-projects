package ua.org.oa.ansimov;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UtilParserJaxb {
	
	public static Shop parseFromXlmToObject() {
		Shop shop = null;
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Shop.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			File file = new File("XML_for_parsing.xml");
			shop = (Shop) unmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}		
		
		return shop;		
	}
	
	public static void parseToXlmFromObject(Shop shop) {
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Shop.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			File file = new File("XML_after_parsing.xml");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(shop, file);
			marshaller.marshal(shop, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}	
	}
}
