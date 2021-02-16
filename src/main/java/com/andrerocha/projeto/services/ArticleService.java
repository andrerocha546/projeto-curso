package com.andrerocha.projeto.services;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.repositories.ArticleRepository;

public class ArticleService {
	
	private ArticleRepository repository = new ArticleRepository();
	
	public Article insert(Article article) {
		return repository.register(article);
	}

}
