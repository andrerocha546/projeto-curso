package com.andrerocha.projeto.entities.data.article;

import javax.persistence.Embeddable;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

@Embeddable
public class CategoryName {
	
	private static final Validator VALIDATOR = new ValidatorCategoryName();

	private String name;

	public CategoryName(String name) {
		this.name = isValidName(name);
	}

	public CategoryName() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = isValidName(name);
	}
	
	private String isValidName(String name) {
		if (!VALIDATOR.isValid(name)) {
			throw new DataException("A categoria deve ter entre 3 e 15 caracteres.");
		}
		return name;
	}

}
