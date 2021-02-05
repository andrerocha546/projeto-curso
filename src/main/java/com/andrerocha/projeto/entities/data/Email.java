package com.andrerocha.projeto.entities.data;

import com.andrerocha.projeto.entities.data.exception.DataException;

public class Email {
	private static final ValidatorEmail validator = new ValidatorEmail();
	

	private String email;

	public Email(String email) {
		this.email = isValidEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private String isValidEmail(String email) {
		if (!validator.isValidEmailAddressRegex(email) || email == null) {
			throw new DataException("Email " + email + " não é valido");
		}
		return email;
	}

}
