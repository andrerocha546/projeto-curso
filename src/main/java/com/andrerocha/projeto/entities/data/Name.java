package com.andrerocha.projeto.entities.data;

import javax.persistence.Embeddable;

import com.andrerocha.projeto.entities.data.exception.DataException;

@Embeddable
public class Name {

	private static final Validator validator = new ValidatorName();

	private String name;

	public Name() {
	}

	public Name(String name) {
		this.name = isValidName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = isValidName(name);
	}

	private String isValidName(String name) {
		if (!validator.isValid(name) || name == null) {
			throw new DataException("Nome " + name + "invalido");
		}
		return name;
	}

}
