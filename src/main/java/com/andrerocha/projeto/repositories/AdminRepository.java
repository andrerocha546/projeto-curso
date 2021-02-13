package com.andrerocha.projeto.repositories;

import javax.persistence.EntityManager;

import com.andrerocha.projeto.entities.Admin;

public class AdminRepository {
	
	private EntityManager entityManager;

	public AdminRepository() {
		this.entityManager = EntityManagerFactory.getEntityManager();
	}

	public Admin register(Admin admin) {
		entityManager.getTransaction().begin();
		entityManager.persist(admin);
		entityManager.getTransaction().commit();
		return admin;
	}
}
