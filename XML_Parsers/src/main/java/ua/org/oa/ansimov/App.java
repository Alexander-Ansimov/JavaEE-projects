package ua.org.oa.ansimov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
	//Parse by JAXB parser from XML to Object 	
		System.out.println((shop = UtilParserJaxb.parseFromXlmToObject()).toString());			
		
	//Parse by JAXB parser from Object to XML
		UtilParserJaxb.parseToXlmFromObject(shop);
		
	//Parse by DOM-parser from XML to String
		UtilParserDom.parseToObjectByDom();
		
	}

}
