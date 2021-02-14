package com.andrerocha.projeto.entities.data.article;

import org.apache.commons.validator.routines.UrlValidator;

import com.andrerocha.projeto.entities.data.Validator;

public class ValidatorImageUrl implements Validator {

	@Override
	public boolean isValid(String url) {
		String[] schemes = { "http", "https" };
		UrlValidator urlValidator = new UrlValidator(schemes);
		boolean isValid = urlValidator.isValid(url);
		return isValid;
	}

}
