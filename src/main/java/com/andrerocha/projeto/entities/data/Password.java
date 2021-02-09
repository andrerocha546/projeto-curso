package com.andrerocha.projeto.entities.data;

import javax.persistence.Embeddable;

import com.andrerocha.projeto.entities.data.exception.DataException;
import com.andrerocha.projeto.services.BCryptHashService;
import com.andrerocha.projeto.services.Encryptor;

@Embeddable
public class Password {

	private static final Validator validator = new ValidatorPassword();
	private static final Encryptor encryptor = new BCryptHashService();

	private String password;

	public Password() {
	}

	public Password(String password) {
		this.password = encryptPassword(password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = encryptPassword(password);
	}

	private String isValidPassword(String password) {
		if (!validator.isValid(password) || password == null) {
			throw new DataException("Senha invalida, digite uma melhor.");
		}
		return password;
	}
	
	private String encryptPassword(String password) {
		String passwdEncrypt = encryptor.encrypt(isValidPassword(password));
		return passwdEncrypt;
	}

}
