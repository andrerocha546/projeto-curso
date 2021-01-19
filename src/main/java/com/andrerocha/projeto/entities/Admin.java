package com.andrerocha.projeto.entities;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {
	private static final long serialVersionUID = 1L;
	
	private Boolean admin = true;

	public Admin() {
		super();
	}

	public Admin(Integer id, String name, String email, String password) {
		super(id, name, email, password);
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	

}
