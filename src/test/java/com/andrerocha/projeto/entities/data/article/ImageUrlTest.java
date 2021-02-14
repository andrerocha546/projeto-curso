package com.andrerocha.projeto.entities.data.article;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;

class ImageUrlTest {

	@Test
	void naoDeveriaCriarUrlDeImagensInvalidas() {
				
		assertThrows(DataException.class, 
				() -> new ImageUrl(null));
		
		assertThrows(DataException.class, 
				() -> new ImageUrl(""));
		
		assertThrows(DataException.class, 
				() -> new ImageUrl("google.com"));
	}

}
