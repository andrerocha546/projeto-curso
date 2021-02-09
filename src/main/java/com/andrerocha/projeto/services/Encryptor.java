package com.andrerocha.projeto.services;

public interface Encryptor {
	
	String encrypt(String password);
	boolean checkPassword(String decryptCode, String hashed);

}
