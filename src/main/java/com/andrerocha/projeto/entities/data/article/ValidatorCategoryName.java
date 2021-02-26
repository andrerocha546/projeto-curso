package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;

public class ValidatorCategoryName implements Validator {

	@Override
	public boolean isValid(String string) {
		boolean isValid = true;
		final int MAX_LENGTH = 15;
		final int MIN_LENGTH = 3;
		if (string == null || string.length() < MIN_LENGTH || string.length() > MAX_LENGTH) {
			isValid = false;
		}
		return isValid;
	}

}
