package ua.org.oa.ansimov;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UtilParserDom {
	
	public static Shop parseToObjectByDom() {
				
		Shop shop = new Shop();
		File file = new File("XML_for_parsing.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			Element rootElem = doc.getDocumentElement();
			NodeList elements = rootElem.getElementsByTagName("goods");
			List<Goods> goodsList = new ArrayList<>();
			for (int i = 0; i < elements.getLength(); i++) {
				Goods goods = new Goods();
				Element element = (Element)elements.item(i);
				System.out.println(element.getTagName()+ "  id = " + element.getAttribute("id"));
				goods.setId(Integer.parseInt(element.getAttribute("id")));
				System.out.print("name = " + element.getElementsByTagName("name").item(0).getTextContent());
				goods.setName(element.getElementsByTagName("name").item(0).getTextContent());
				System.out.print(",  price = " + element.getElementsByTagName("price").item(0).getTextContent());
				goods.setPrice(Integer.parseInt(element.getElementsByTagName("price").item(0).getTextContent()));
				System.out.print(",  category = " + element.getElementsByTagName("category").item(0).getTextContent());
				goods.setName(element.getElementsByTagName("category").item(0).getTextContent());
				System.out.println(",  description = " + element.getElementsByTagName("description").item(0).getTextContent());
				goods.setName(element.getElementsByTagName("description").item(0).getTextContent());
				
				goodsList.add(goods);
			}			
			shop.setGoods(goodsList);			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(shop.toString());
		return shop; 			
	}

}
