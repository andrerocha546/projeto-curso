package com.andrerocha.projeto.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.andrerocha.projeto.entities.data.article.ArticleData;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
