package com.andrerocha.projeto.entities.data.article;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

import com.andrerocha.projeto.entities.data.Validator;
import com.andrerocha.projeto.entities.data.exception.DataException;

@Embeddable
public class Content {
	
	private static final Validator VALIDATOR = new ValidatorContent();
	
	@Lob
	private String content;

	public Content(String content) {
		this.content = isValidContent(content);
	}

	public Content() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = isValidContent(content);
	}
	
	private String isValidContent(String content) {
		if (!VALIDATOR.isValid(content)) {
			throw new DataException("O conteúdo deve ter pelo menos 100 caracteres");
		}
		return content;
	}

}
