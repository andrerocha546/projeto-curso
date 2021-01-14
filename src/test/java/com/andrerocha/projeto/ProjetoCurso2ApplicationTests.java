package com.andrerocha.projeto;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.repositories.UserRepository;

@SpringBootTest
class ProjetoCurso2ApplicationTests {
	
	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		
		User u1 = new User(null, "ana", "ana@gmail.com", "ana");
		User u2 = new User(null, "paulo", "paulo@gmail.com", "paulo");
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
