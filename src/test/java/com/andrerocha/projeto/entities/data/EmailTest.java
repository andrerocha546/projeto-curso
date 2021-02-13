package com.andrerocha.projeto.entities.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.andrerocha.projeto.entities.data.exception.DataException;
import com.andrerocha.projeto.entities.data.personal.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEndercosInvalidos() {
		assertThrows(DataException.class, 
				() -> new Email(null));
		
		assertThrows(DataException.class, 
				() -> new Email(""));
		
		assertThrows(DataException.class, 
				() -> new Email("email"));
		
		assertThrows(DataException.class, 
				() -> new Email("email.com"));
		
		assertThrows(DataException.class, 
				() -> new Email("email.com.br"));
		
		assertThrows(DataException.class, 
				() -> new Email("email@"));
		
		assertThrows(DataException.class, 
				() -> new Email("email@com"));
		
		assertThrows(DataException.class, 
				() -> new Email("email@.com"));
	}

}
