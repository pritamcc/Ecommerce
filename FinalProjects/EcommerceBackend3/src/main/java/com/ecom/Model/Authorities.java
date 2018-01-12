package com.ecom.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities {
	   
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
       @Column
	   private int authorityid;
	   
	   @Column
	   private String emailId;
	   
	   @Column
	   private String authorities;

	   
	public int getAuthorityid() {
		return authorityid;
	}

	public void setAuthorityid(int authorityid) {
		this.authorityid = authorityid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	   
	   
	   
}
