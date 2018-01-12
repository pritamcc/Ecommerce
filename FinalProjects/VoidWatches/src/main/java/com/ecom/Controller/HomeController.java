package com.ecom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.DAO.ProductDAO;
import com.ecom.Model.Product;


@Controller
public class HomeController 
{         
	@Autowired
	private ProductDAO productDAO;    
	  
	
	     @RequestMapping("/")
          public String Display()
          {
  	       return "index";
           }	
	       
	     @RequestMapping("/listProduct")
		 public String listProduct(Model theModel)
		 {
			 List<Product> theproducts = productDAO.getAllProduct();
			 theModel.addAttribute("products",theproducts);
			  
			 return "productDetail";
		 }
	     
	    /* @RequestMapping("/listProduct/viewProduct/{id}")
	     public String viewProduct(@PathVariable String id,Model model)
	     {
	       Product product = productDAO.getProductbyId(id);
	       model.addAttribute(product);
	       
	       return "viewProduct";	  
	     }*/
	     
	     
	     @RequestMapping("/listProduct/viewProduct")
	     public String viewProduct(@RequestParam("productId") int theId,
	    		                   Model model)
	     {
	       Product product = productDAO.getProductbyId(theId);
	       
	       model.addAttribute("products",product);
	       
	       return "viewProduct";	  
	     }
	     
	     @RequestMapping("/admin")
	     public String adminPage()
	     {
	    	 return "admin";
	     }
	     
	     @RequestMapping("/admin/productInventory")
	     public String productInventory(Model model)
	     {
	    	 List<Product> theproducts = productDAO.getAllProduct();
			 model.addAttribute("products",theproducts);
			 
			 return "productInventory";
	     }
	     
	     @RequestMapping("/admin/productInventory/addProduct")
	     public String getProductForn(Model theModel)
	 	{
	 		Product theProduct = new Product();
	 	
	 		theModel.addAttribute("addproduct", theProduct);
	 		return "productform";
	 	}
	     
	     @PostMapping(value="/admin/productInventory/addProduct")
	     public String addProducts(@ModelAttribute("addproduct") Product theProduct)
	     {
	    	productDAO.addProducts(theProduct);
			
	    	return "redirect:/admin/productInventory"; 
	     }
	     
	     /*@RequestMapping("/admin/productInventory/addProducts")
	     public String saveProduct(@ModelAttribute("addproduct") Product theProduct)
	     {
	 		productDAO.addProducts(theProduct);
	 		return "productform";
	 	}*/
	     
}
