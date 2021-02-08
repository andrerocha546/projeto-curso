package com.andrerocha.projeto.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrerocha.projeto.builders.AdminBuilder;
import com.andrerocha.projeto.builders.UserBuilder;
import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.User;

@Configuration
@Profile("test")
public class Instantiation {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetocurso");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
		User user = new UserBuilder()
				.setName("Andre Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		Admin admin = new AdminBuilder()
				.setName("Andre Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		
		em.getTransaction().begin();
		em.persist(user);
		em.persist(admin);
		em.getTransaction().commit();
	}

}
