package com.andrerocha.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.repositories.ArticleRepository;
import com.andrerocha.projeto.services.exception.ObjectNotFoundException;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository repository;
	
	public Article insert(Article article) {
		return repository.save(article);
	}
	
	public List<Article> findAll() {
		return repository.findAll();
	}
	
	public Article findById(Integer id) {
		Optional<Article> article = repository.findById(id);
		return article.orElseThrow(() -> new ObjectNotFoundException("Artigo não encontrado"));
	}

}
