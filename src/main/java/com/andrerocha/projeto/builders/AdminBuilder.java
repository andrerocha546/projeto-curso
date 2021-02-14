package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;
import com.andrerocha.projeto.entities.data.personal.PersonalData;

public class AdminBuilder implements PersonBuilder {
	
	private PersonalData personalData = new PersonalData();
	
	@Override
	public PersonBuilder reset() {
		this.personalData = new PersonalData();
		return this;
	}

	@Override
	public AdminBuilder setName(String name) {
		Name nameAdmin = new Name(name);
		personalData.setName(nameAdmin);
		return this;
	}

	@Override
	public AdminBuilder setEmail(String email) {
		Email emailAdmin = new Email(email);
		personalData.setEmail(emailAdmin);
		return this;
	}

	@Override
	public AdminBuilder setPassword(String password) {
		Password passAdmin = new Password(password);
		personalData.setPassword(passAdmin);
		return this;
	}

	public Admin getResult() {
		Admin admin = new Admin();
		admin.setPersonalData(personalData);
		return admin;
	}


}
