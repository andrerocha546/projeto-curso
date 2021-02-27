package com.andrerocha.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.services.ArticleService;

@RestController
@RequestMapping(value = "articles")
public class ArticleResource {
	
	@Autowired
	private ArticleService service;
	
	@GetMapping
	public ResponseEntity<List<Article>> findAll() {
		List<Article> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
