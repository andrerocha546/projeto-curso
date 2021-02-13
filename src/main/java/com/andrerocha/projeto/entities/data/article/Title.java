package com.andrerocha.projeto.entities.data.article;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

public class Title {
	
	private static final Validator validator = new ValidatorTitle();

	private String title;

	public Title(String title) {
		this.title = isValidTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = isValidTitle(title);
	}
	
	private String isValidTitle(String title) {
		if(!validator.isValid(title)) {
			throw new DataException("O título deve ter entre 5 e 50 caracteres."); 
		}
		return title;
	}

}
