package ua.org.oa.ansimov;

import javax.xml.bind.annotation.XmlAttribute;

public class Goods {
	
	
	private Integer id;
	private Integer price;
	private String name;
	private String category;
	private String description;
	
	
	
	public Integer getId() {
		return id;
	}
	@XmlAttribute
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", price=" + price + ", name=" + name + ", category=" + category + ", description="
				+ description + "]";
	}
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
