package com.andrerocha.projeto.entities.data;

import com.andrerocha.projeto.entities.data.exception.DataException;

public class Password {
	
	private static final Validator validator = new ValidatorPassword();

	private String password;

	public Password(String password) {
		this.password = isValidPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = isValidPassword(password);
	}
	
	private String isValidPassword(String password) {
		if (!validator.isValid(password) || password == null) {
			throw new DataException("Senha invalida, digite uma melhor.");
		}
		return password;
	}

}
