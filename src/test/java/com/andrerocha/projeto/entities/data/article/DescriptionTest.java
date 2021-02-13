package com.andrerocha.projeto.entities.data.article;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;

class DescriptionTest {

	@Test
	void naoDeveriaCriarDescricoesInvalidas() {
		assertThrows(DataException.class, 
				() -> new Description(null));
		
		assertThrows(DataException.class, 
				() -> new Description(""));
		
		assertThrows(DataException.class, 
				() -> new Description("aglrhuabipbu"));
	}

}
