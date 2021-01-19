package com.andrerocha.projeto.entities;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(Integer id, String name, String email, String password) {
		super(id, name, email, password);
	}

}
