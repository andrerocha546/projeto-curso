package com.andrerocha.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.repositories.ArticleRepository;

public class ArticleService {
	
	@Autowired
	private ArticleRepository repository;
	
	public Article insert(Article article) {
		return repository.save(article);
	}

}
