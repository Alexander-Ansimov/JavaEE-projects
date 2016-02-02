package ua.org.oa.ansimov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		String path = "XML_for_parsing.xml";
		String xmlForParsing = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String flag;
			while ((flag = reader.readLine()) != null) {
				xmlForParsing = xmlForParsing.concat(flag);
			}
		} catch(Exception e){
			e.printStackTrace();
	    }
		System.out.println(xmlForParsing);
		System.out.println();
		
		Shop shop = UtilParserJaxp.parseFromXlmToObject();
		if (shop != null) {
			System.out.println(shop.toString());
		}
		System.out.println();
		
		Shop shop2 = new Shop();
		Goods goods = new Goods();
		goods.setCategory("categor");
		goods.setDescription("about..");
		goods.setName("name");
		goods.setId(5);
		List<Goods> listGoods = new ArrayList<>();
		listGoods.add(goods);
		shop2.setGoods(listGoods);
		
		UtilParserJaxp.parseToXlmFromObject(shop2);
		
		UtilParserDom.parseToObjectByDom();
		
	}

}
