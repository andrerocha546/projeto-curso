package com.andrerocha.projeto.entities;

import javax.persistence.Entity;

@Entity
public class User extends Person {
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(Integer id, String name, String email, String password) {
		super(id, name, email, password);
	}
	

}
