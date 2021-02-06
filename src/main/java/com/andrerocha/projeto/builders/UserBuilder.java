package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.data.Email;
import com.andrerocha.projeto.entities.data.Name;
import com.andrerocha.projeto.entities.data.Password;
import com.andrerocha.projeto.entities.data.PersonalData;

public class UserBuilder implements Builder {
	
	private PersonalData personalData = new PersonalData();
	
	@Override
	public Builder reset() {
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
