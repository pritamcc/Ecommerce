package com.ecom.DAO;



import java.util.List;

import com.ecom.Model.Product;

public interface ProductDAO {

	void addProducts(Product theProdut);

	List<Product> getAllProduct();
}
