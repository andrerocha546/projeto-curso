package com.andrerocha.clinic.domain;

public class User extends Person {
	
	private Boolean admin = false;

	public User(Integer id, String name, String email, String password, Boolean admin) {
		super(id, name, email, password);
		this.admin = false;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	

}
