package com.ecom.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.ComponentScan;


@Entity
@Table(name="CustomerRegistration")
@ComponentScan(basePackages = "com.ecom")
public class CustomerRegistration {
          
          
          @Column
          @Id
          @GeneratedValue(strategy=GenerationType.AUTO)
          private int id;
          

          @Column
          private String username;
	      
          @Column
          private String firstname;
	      
          @Column
          @NotNull
          @Size(min=1,message="is required")
          private String lastname;
          
          @Column
          private int password;
	      
          @Column
          private String contact;
          
          @Column
          private String email;
	      
          @Column
          private String country;
	      
          @Column
          private String state;
	      
          @Column
          private String address;
	      
          
          @Column
          private String zipcode;


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getFirstname() {
			return firstname;
		}


		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
        

		public void setPassword(int password) {
			this.password = password;
		}
		
		public int getPassword() {
			return password;
		}


		public String getContact() {
			return contact;
		}


		public void setContact(String contact) {
			this.contact = contact;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getZipcode() {
			return zipcode;
		}


		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}


		public CustomerRegistration(int id, String username, String firstname, String lastname, int password,
				String contact, String email, String country, String state, String address, String zipcode) {
			super();
			this.id = id;
			this.username = username;
			this.firstname = firstname;
			this.lastname = lastname;
			this.password = password;
			this.contact = contact;
			this.email = email;
			this.country = country;
			this.state = state;
			this.address = address;
			this.zipcode = zipcode;
		}

        public  CustomerRegistration()
        {}


		@Override
		public String toString() {
			return "CustomerRegistration [id=" + id + ", username=" + username + ", firstname=" + firstname
					+ ", lastname=" + lastname + ", password=" + password + ", contact=" + contact + ", email=" + email
					+ ", country=" + country + ", state=" + state + ", address=" + address + ", zipcode=" + zipcode
					+ "]";
		}
        
          
          
}
