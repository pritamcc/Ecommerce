package com.ecom.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.DAO.ProductDAO;
import com.ecom.Model.Product;

@Repository
public class ProductDAOimpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Product> getAllProduct() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);

		List<Product> products = theQuery.getResultList();

		return products;
	}

	@Transactional
	public void addProducts(Product theProduct) {
		Session currentSession = sessionFactory.getCurrentSession();

		System.out.println("Adding Product");
		currentSession.save(theProduct);
		System.out.println("Success");
	}

/*	public Product getProductbyId(String id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.get(Product.class,id);
		return null;
	}*/
    @Transactional
	public Product getProductbyId(int theId) {
    	
    	Session currentSession = sessionFactory.getCurrentSession();
        
    	Product theProduct = currentSession.get(Product.class,theId);
		
    	return theProduct;
	}

}
