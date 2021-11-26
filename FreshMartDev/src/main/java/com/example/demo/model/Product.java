package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@Column(name="Product_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long product_ID;
	
	public String product_Name;
	public String description;
	public String category;
	public Integer available_Quantity;
	public Integer price;
	public long getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(long product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getAvailable_Quantity() {
		return available_Quantity;
	}
	public void setAvailable_Quantity(Integer available_Quantity) {
		this.available_Quantity = available_Quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	public Product(long product_ID, String product_Name, String description, String category,
			Integer available_Quantity, Integer price) {
		super();
		this.product_ID = product_ID;
		this.product_Name = product_Name;
		this.description = description;
		this.category = category;
		this.available_Quantity = available_Quantity;
		this.price = price;
	}
	

	

}
