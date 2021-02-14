package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

public class ImageUrl {
	
	private static final Validator VALIDATOR = new ValidatorImageUrl();
	
	private String url;

	public ImageUrl(String url) {
		this.url = isValid(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = isValid(url);
	}
	
	private String isValid(String url) {
		if (!VALIDATOR.isValid(url)) {
			throw new DataException("URL inválida.");
		}
		return url;
	}

}
