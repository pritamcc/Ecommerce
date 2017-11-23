package com.ecom.DAOImplementation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecom.DAO.CustomerRegDAO;
import com.ecom.Model.CustomerRegistration;

@Repository("CustomerRegDAO")
public class CustomerRegImpl implements CustomerRegDAO {
      
	@Autowired
	private SessionFactory sessionFactory;
  
	@javax.transaction.Transactional
	public void saveCustomer(CustomerRegistration theCustomerRegistration) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		System.out.println("saving the Customer.....");
		
		currentSession.save(theCustomerRegistration);
	
		
	}
      
	

}
