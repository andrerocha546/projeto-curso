package com.andrerocha.projeto.entities.data.article;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;

class TitleTest {

	@Test
	void naoDeveriaCriarTitulosInvalidos() {
		assertThrows(DataException.class, 
				() -> new Title(null));
		
		assertThrows(DataException.class, 
				() -> new Title(""));
		
		assertThrows(DataException.class, 
				() -> new Title("asdf"));
		
	}

}
