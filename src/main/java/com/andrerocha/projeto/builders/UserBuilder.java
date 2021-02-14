package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;
import com.andrerocha.projeto.entities.data.personal.PersonalData;

public class UserBuilder implements PersonBuilder {
	
	private PersonalData personalData = new PersonalData();
	
	@Override
	public PersonBuilder reset() {
		this.personalData = new PersonalData();
		return this;
	}

	@Override
	public UserBuilder setName(String name) {
		Name nameUser = new Name(name);
		personalData.setName(nameUser);
		return this;
	}

	@Override
	public UserBuilder setEmail(String email) {
		Email emailUser = new Email(email);
		personalData.setEmail(emailUser);
		return this;
	}

	@Override
	public UserBuilder setPassword(String password) {
		Password passUser = new Password(password);
		personalData.setPassword(passUser);
		return this;
	}

	public User getResult() {
		User user = new User();
		user.setPersonalData(personalData);
		return user;
	}


}
