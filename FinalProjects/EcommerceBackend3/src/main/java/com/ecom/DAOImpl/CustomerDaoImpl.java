package com.ecom.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ecom.DAO.CustomerDAO;
import com.ecom.Model.Authorities;
import com.ecom.Model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addCustomer(Customer theCustomer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		theCustomer.getUsers().setEnabled(true);
		
		Authorities authorities = new Authorities();
		authorities.setAuthorities("ROLE_USER");
		authorities.setEmailId(theCustomer.getUsers().getEmailId());
		
		currentSession.save(theCustomer);
		currentSession.save(authorities);
		
		System.out.println("Success");
		
	}

}
