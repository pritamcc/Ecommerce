package com.ecom.DAOImplementation;



import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecom.DAO.ProductDAO;
import com.ecom.Model.Product;

@Repository("ProductDAO")
public class ProductImpl implements ProductDAO {
     
	  @Autowired
	  private SessionFactory sessionFactory;
	  
	  @Transactional
	  public List<Product> getAllProduct() {
		  Session currentSession = sessionFactory.getCurrentSession();
		  
		  Query<Product> theQuery = currentSession.createQuery("from Product",Product.class);
		  
		  List<Product> products = theQuery.getResultList();
		  
		  return products;
		}
	  
	  
     @javax.transaction.Transactional
	public void addProducts(Product theProdut) 
	{
	    Session currentSession = sessionFactory.getCurrentSession();	
		
	    System.out.println("Adding Product");
	    currentSession.save(theProdut);
	    System.out.println("Success");
	}

	

}
