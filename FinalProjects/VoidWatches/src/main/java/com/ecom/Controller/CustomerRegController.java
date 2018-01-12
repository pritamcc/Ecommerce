package com.ecom.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.ecom.DAO.CustomerDAO;
import com.ecom.Model.BillingAddress;
import com.ecom.Model.Customer;
import com.ecom.Model.ShippingAddress;
import com.ecom.Model.User;


    
@Controller
public class CustomerRegController
{     
     @Autowired 
     private CustomerDAO customerDAO; 
	 
     @GetMapping("/registrationForm")
	 public String Registration(Model theModel)
	 {
		 Customer theCustomer = new Customer();
		 User theUser = new User();
		 BillingAddress ba = new BillingAddress();
		 ShippingAddress sa = new ShippingAddress();
		 theCustomer.setBillingAddress(ba);
		 theCustomer.setShippingAddress(sa);
		 theCustomer.setUsers(theUser);
		 
		 theModel.addAttribute("customer",theCustomer);
		 
		 return "registration-form";
		 
	 }
	 
	 @PostMapping("/SaveCustomer")
	 public String saveCustomer( @ModelAttribute("customer")  Customer theCustomer)	                   
	 {   
			 customerDAO.addCustomer(theCustomer);
		  
		       return "index";
		   }
  
	 }  
	  
	