package com.andrerocha.projeto.entities.data.personal;

import javax.persistence.Embeddable;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

@Embeddable
public class Email {
	
	private static final Validator validator = new ValidatorEmail();

	private String email;

	public Email() {
	}

	public Email(String email) {
		this.email = isValidEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email =  isValidEmail(email);
	}
	
	private String isValidEmail(String email) {
		if (!validator.isValid(email) || email == null) {
			throw new DataException("Email " + email + " não é valido");
		}
		return email;
	}

}
