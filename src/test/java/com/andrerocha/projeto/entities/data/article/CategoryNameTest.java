package com.andrerocha.projeto.entities.data.article;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;

class CategoryNameTest {

	@Test
	void naoDeveriaCriarNomesInvalidosDeCategorias() {
		
		assertThrows(DataException.class, 
				() -> new CategoryName(null));
		
		assertThrows(DataException.class, 
				() -> new CategoryName(""));
		
		assertThrows(DataException.class, 
				() -> new CategoryName("as"));
		
		assertThrows(DataException.class, 
				() -> new CategoryName("olAIGBUKLVBVBKLVBOBVOADBVBKDFVBOL"));
	}

}
