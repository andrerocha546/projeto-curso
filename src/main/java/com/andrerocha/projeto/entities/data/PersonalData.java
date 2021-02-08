package com.andrerocha.projeto.entities.data;

public class PersonalData {

	private Name name;
	private Email email;
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
