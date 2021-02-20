package com.andrerocha.projeto.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;

@Entity
@DiscriminatorValue("0")
public class User extends Person {
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public User(Name name, Email email, Password password) {
		super(name, email, password);
	}

}
