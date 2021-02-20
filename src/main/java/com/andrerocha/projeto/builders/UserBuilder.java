package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;

public class UserBuilder implements PersonBuilder {
	
	private User user = new User();
	
	@Override
	public PersonBuilder reset() {
		this.user = new User();
		return this;
	}

	@Override
	public UserBuilder setName(String name) {
		Name nameUser = new Name(name);
		user.setName(nameUser);
		return this;
	}

	@Override
	public UserBuilder setEmail(String email) {
		Email emailUser = new Email(email);
		user.setEmail(emailUser);
		return this;
	}

	@Override
	public UserBuilder setPassword(String password) {
		Password passUser = new Password(password);
		user.setPassword(passUser);
		return this;
	}

	public User getResult() {
		return user;
	}


}
