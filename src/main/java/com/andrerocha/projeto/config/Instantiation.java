package com.andrerocha.projeto.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrerocha.projeto.builders.AdminBuilder;
import com.andrerocha.projeto.builders.UserBuilder;
import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class Instantiation {

	
	public static void main(String[] args) {

		UserRepository userRepository = new UserRepository();
		
		User user = new UserBuilder()
				.setName("Andre Santos Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		Admin admin = new AdminBuilder()
				.setName("Andre Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		
		userRepository.register(user);
	}

}
