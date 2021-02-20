package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;

public class AdminBuilder implements PersonBuilder {
	
	private Admin admin = new Admin();
	
	@Override
	public PersonBuilder reset() {
		this.admin = new Admin();
		return this;
	}

	@Override
	public AdminBuilder setName(String name) {
		Name nameAdmin = new Name(name);
		admin.setName(nameAdmin);
		return this;
	}

	@Override
	public AdminBuilder setEmail(String email) {
		Email emailAdmin = new Email(email);
		admin.setEmail(emailAdmin);
		return this;
	}

	@Override
	public AdminBuilder setPassword(String password) {
		Password passAdmin = new Password(password);
		admin.setPassword(passAdmin);
		return this;
	}

	public Admin getResult() {
		return admin;
	}


}
