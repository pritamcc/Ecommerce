/*package com.ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ecom.DAO.ProductDAO;
import com.ecom.Model.Product;

@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO; 
	
	@RequestMapping("admin/product/productform")
	public String getProductForn(Model theModel)
	{
		Product theProduct = new Product();
		theModel.addAttribute("addproduct", theProduct);
		return "productform";
	}
	
	 @RequestMapping("/listProduct")
	 public String listProduct(Model theModel)
	 {
		 List<Product> theProducts = productDAO.getAllProduct();
		 theModel.addAttribute("products",theProducts);
		 return "productDetail";
	 }
   
	
	@RequestMapping("admin/product/saveproduct")
	public String saveProduct(@ModelAttribute("addproduct") Product theProduct)
	 {
		productDAO.addProducts(theProduct);
		return "productform";
	}
	
}
*/