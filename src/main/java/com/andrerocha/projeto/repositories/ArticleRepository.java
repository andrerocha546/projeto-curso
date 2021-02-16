package com.andrerocha.projeto.repositories;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.entities.User;

public class ArticleRepository {

	private EntityManager entityManager;

	public ArticleRepository() {
		this.entityManager = EntityManagerFactory.getEntityManager();
	}

	public Article register(Article article) {
		entityManager.getTransaction().begin();
		entityManager.persist(article);
		entityManager.getTransaction().commit();
		return article;
	}

}
