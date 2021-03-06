package com.zensar.entities;

import org.springframework.stereotype.Component;

/*
	 * Author:	Parul Singh
	 * Creation Date: 25th Jul 2019 5.55PM
	 * Modified Date: 30th Jul 2019 15.08PM
	 * Version: 3.0
	 * Copyright: Zensar Technologies. All rights reserved. 
	 * Description: Represents business entity product.
	 * 
	 * value object of application,
	 * domain or application object,
	 * It is also POJO.
	 */
@Component	
public class Product {	
			
	private int productId;
	private String name;
	private String brand;
	private double price;
	
	public Product(){
	
	}
	
	public Product(int productId, String name, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
