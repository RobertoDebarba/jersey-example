package br.com.robertodebarba.jersey_example_project;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {

	private int id;
	private String name;
	private String description;
	private int stock;
	private double price;

	public Product() {
	}

	public Product(final int id, final String name, final String description, final int stock, final double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.stock = stock;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(final int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

}
