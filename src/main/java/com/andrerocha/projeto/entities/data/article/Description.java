package com.andrerocha.projeto.entities.data.article;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

@Embeddable
public class Description {

	private static final Validator VALIDATOR = new ValidatorDescription();
	
	@Lob
	private String description;

	public Description(String description) {
		this.description = isValidDescription(description);
	}

	public Description() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = isValidDescription(description);
	}

	private String isValidDescription(String description) {
		if (!VALIDATOR.isValid(description)) {
			throw new DataException("Descrição deve ter entre 100 e 1000 caracteres.");
		}
		return description;
	}

}
