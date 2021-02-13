package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;

public class ValidatorTitle implements Validator {

	@Override
	public boolean isValid(String title) {
		boolean isValid = true;
		final int MAX_TITLE = 50;
		final int MIN_TITLE = 5;
		if (title == null || title.length() < MIN_TITLE || title.length() > MAX_TITLE) {
			isValid = false;
		}
		return isValid;
	}

}
