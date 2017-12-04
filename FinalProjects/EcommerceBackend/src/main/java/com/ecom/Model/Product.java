package com.ecom.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GeneratorType;


@Entity
@Table(name="product")
public class Product {
	  
      @Id
      @Column
      @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;
      
      @Column
     /* @NotNull(message="is required")*/
      @NotNull(message="is required")
      @Size(min=1, message="is required")
	  private String product_name;
      
      @Column
      /*@NotNull*/
      @NotNull(message="is required")
      @Size(min=1,message="is required")
      private String manufacturer;
      
      @Min(value=0, message="must be greater than or equal to zero")
      @Max(value=10, message="must be less than or equal to 10")
      @Column
      private int stock;
      
      @Column
      @NotNull(message="is required")
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
	
	
	public Product()
	{}
	
	}

