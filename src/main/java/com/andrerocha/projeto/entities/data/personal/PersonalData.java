package com.andrerocha.projeto.entities.data.personal;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class PersonalData {
	
	@Embedded
	private Name name;
	@Embedded
	private Email email;
	@Embedded
	private Password password;	

	public PersonalData() {
	}

	public PersonalData(Name name, Email email, Password password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

}
