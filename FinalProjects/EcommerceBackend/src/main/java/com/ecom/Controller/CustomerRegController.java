package com.ecom.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.DAO.CustomerRegDAO;
import com.ecom.Model.CustomerRegistration;





    
@Controller
public class CustomerRegController
{     
	 @Autowired
	 private CustomerRegDAO customerRegDAO;  
        
	 @RequestMapping("/registrationForm")
	 public String Registration(Model theModel)
	 {
		 CustomerRegistration theCustomerRegistration = new CustomerRegistration();
		 
		 theModel.addAttribute("customer", theCustomerRegistration);
		 
		 return "registration-form";
	 }
	 
	 @RequestMapping("/saveCustomer")
	 public String saveCustomer(@ModelAttribute("customer")  CustomerRegistration theCustomerRegistration)
	 {
		customerRegDAO.saveCustomer(theCustomerRegistration);   
		
		 return "index";
	 }  
	  
	
}