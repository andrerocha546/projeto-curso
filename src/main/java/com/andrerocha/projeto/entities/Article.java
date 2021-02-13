package com.andrerocha.projeto.entities;

import com.andrerocha.projeto.entities.data.article.ArticleData;

public class Article {
	
	private Integer id;
	
	private ArticleData articleData;

	public Article() {
	}

	public Article(ArticleData articleData) {
		this.id = null;
		this.articleData = articleData;
	}
	
	
}
