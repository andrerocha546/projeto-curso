package com.andrerocha.projeto.repositories;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {
	
	private static final javax.persistence.EntityManagerFactory entityManagerFactory = 
			Persistence.createEntityManagerFactory("projetocurso");
	private static EntityManager entityManager = null;
	
	public static EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

}
