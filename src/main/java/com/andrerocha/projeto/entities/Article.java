package com.andrerocha.projeto.entities;

import javax.persistence.Embedded;

import com.andrerocha.projeto.entities.data.article.ArticleData;

public class Article {
	
	private Integer id;
	
	@Embedded
	private ArticleData articleData;

	public Article() {
	}

	public Article(ArticleData articleData) {
		this.id = null;
		this.articleData = articleData;
	}

	public ArticleData getArticleData() {
		return articleData;
	}

	public void setArticleData(ArticleData articleData) {
		this.articleData = articleData;
	}
	
}
