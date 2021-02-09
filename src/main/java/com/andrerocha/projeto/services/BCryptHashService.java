package com.andrerocha.projeto.services;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptHashService implements Encryptor {

	@Override
	public String encrypt(String password) {
		String gensalt = BCrypt.gensalt(10);
		return BCrypt.hashpw(password, gensalt);
	}

	@Override
	public boolean checkPassword(String password, String decryptCode) {
		boolean isMatch = BCrypt.checkpw(password, decryptCode);
		return isMatch;
	}

}
