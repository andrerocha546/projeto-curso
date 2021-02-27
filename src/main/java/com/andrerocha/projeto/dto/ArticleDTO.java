package com.andrerocha.projeto.dto;

import java.io.Serializable;

import com.andrerocha.projeto.entities.Article;

public class ArticleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String title;
	private String description;
	private String imageUrl;
	private String content;
	private PersonDTO author;

	public ArticleDTO(Article article) {
		this.id = article.getId();
		this.title = article.getArticleData().getTitle().getTitle();
		this.description = article.getArticleData().getDescription().getDescription();
		this.imageUrl = article.getArticleData().getImageUrl().getUrl();
		this.content = article.getArticleData().getContent().getContent();
		this.author = new PersonDTO(article.getArticleData().getPerson());
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getContent() {
		return content;
	}

	public PersonDTO getAuthor() {
		return author;
	}
	
}
