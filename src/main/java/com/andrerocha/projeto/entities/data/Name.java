package com.andrerocha.projeto.entities.data;

import com.andrerocha.projeto.entities.data.exception.DataException;

public class Name {
	private static final ValidatorName validator = new ValidatorName();

	private String name;

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
		if (!validator.isValidName(name) || name == null) {
			throw new DataException("Nome " + name + "invalido");
		}
		return name;
	}

}
