package com.andrerocha.projeto.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerocha.projeto.dto.ArticleDTO;
import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.services.ArticleService;

@RestController
@RequestMapping(value = "articles")
public class ArticleResource {
	
	@Autowired
	private ArticleService service;
	
	@GetMapping
	public ResponseEntity<List<ArticleDTO>> findAll() {
		List<Article> list = service.findAll();
		List<ArticleDTO> listDto = list.stream()
				.map(article -> new ArticleDTO(article)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ArticleDTO> findById(@PathVariable Integer id) {
		Article article = service.findById(id);
		ArticleDTO articleDto = new ArticleDTO(article);
		return ResponseEntity.ok().body(articleDto);
	}

}
