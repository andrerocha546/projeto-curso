package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;

public class ValidatorDescription implements Validator {

	@Override
	public boolean isValid(String string) {
		boolean isValid = true;
		final int MAX_LENGTH = 1000;
		final int MIN_LENGTH = 100;
		if (string == null || string.length() < MIN_LENGTH || string.length() > MAX_LENGTH) {
			isValid = false;
		}
		return isValid;
	}
	
}
