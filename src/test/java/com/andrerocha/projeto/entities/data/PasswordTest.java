package com.andrerocha.projeto.entities.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;
import com.andrerocha.projeto.entities.data.personal.Password;

class PasswordTest {
	
	private static final String[] LIXOS = {
			null,
			"",
			"asd",
			"asdfasds",
			"12345678",
			"abcd1234",
			"ABCD1234",
			"sdlvgbaosb390248"
	};

	@Test
	void naoDeveriaCriarSenhasInvalidas() {
		for (String string : LIXOS) {
			assertThrows(DataException.class, 
					() -> new Password(string));
		}
	}

}
