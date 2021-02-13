package com.andrerocha.projeto.repositories;

import javax.persistence.EntityManager;

import com.andrerocha.projeto.entities.User;

public class UserRepository {
	
	private EntityManager entityManager	;
	
	public UserRepository() {
		this.entityManager = EntityManagerFactory.getEntityManager();
	}
	
	public User register(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		return user;
	}

}
