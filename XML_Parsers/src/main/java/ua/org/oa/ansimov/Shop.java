package ua.org.oa.ansimov;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Shop {
	

	private List<Goods> goods;
	
	public Shop(){
		
	}

	public List<Goods> getGoods() {
		return goods;
	}
	@XmlElement(name="goods")
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}

	@Override
	public String toString() {
		return "Shop [goods=" + goods + "]";
	}
	
		
}
