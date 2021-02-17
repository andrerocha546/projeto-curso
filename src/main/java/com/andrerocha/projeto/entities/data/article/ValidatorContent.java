package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;

public class ValidatorContent implements Validator {

	@Override
	public boolean isValid(String string) {
		boolean isValid = true;
		final int MIN_LENGTH = 100;
		if (string == null || string.length() < MIN_LENGTH) {
			isValid = false;
		}
		return isValid;
	}
	
}
