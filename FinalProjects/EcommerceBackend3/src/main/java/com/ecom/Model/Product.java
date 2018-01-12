package com.ecom.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Table(name="product")
public class Product {
	  
      @Id
      @Column(name="ID")
      @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;
      
      @NotEmpty(message ="The product name must not be null")
      @Column(name="product_name")
	  private String productname;
      
      @Column(name="manufacturer")
      private String manufacturer;
      
      @Column(name="category")
      private String category;
    
      @Min(value=0, message="The product stock must not be less than zero")
      @Column(name="stock")
      private int stock;
      
      @Column(name="Description")
      private String description;
      
      @Min(value= 0, message="The product price must not be less than zero")
      @Column(name="price")
      private double price;
      
      @Transient
      private MultipartFile productImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

     

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	} 

	  

}

