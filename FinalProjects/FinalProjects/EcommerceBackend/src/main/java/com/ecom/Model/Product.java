package com.ecom.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	  
      @Id
      @Column
	  private int id;
      
      @Column
	  private String product_name;
      @Column
      private String manufacturer;
      @Column
      private int stock;
      @Column
      private String description;
	  
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product(int id, String product_name, String manufacturer, int stock, String description) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.manufacturer = manufacturer;
		this.stock = stock;
		this.description = description;
	}
	
	public Product()
	{}
	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", manufacturer=" + manufacturer + ", stock="
				+ stock + ", description=" + description + "]";
	}
}
