package com.andrerocha.projeto;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.PersonRepository;

@SpringBootTest
class ProjetoCurso2ApplicationTests {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Test
	void contextLoads() {
		
		Person u1 = new User(null, "ana", "ana@gmail.com", "ana");
		Person u2 = new User(null, "paulo", "paulo@gmail.com", "paulo");
		personRepository.saveAll(Arrays.asList(u1, u2));
		
		Person a1 = new Admin(null, "julia", "julia@gmail.com", "julia");
		Person a2 = new Admin(null, "maria", "maria@gmail.com", "maria");
		personRepository.saveAll(Arrays.asList(a1, a2));
		
		
	}

}
