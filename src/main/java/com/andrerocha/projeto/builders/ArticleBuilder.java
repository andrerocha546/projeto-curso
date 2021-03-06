package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.data.article.ArticleData;
import com.andrerocha.projeto.entities.data.article.Content;
import com.andrerocha.projeto.entities.data.article.Description;
import com.andrerocha.projeto.entities.data.article.ImageUrl;
import com.andrerocha.projeto.entities.data.article.Title;

public class ArticleBuilder implements ArticlesBuilder {

	private ArticleData articleData = new ArticleData();

	@Override
	public ArticleBuilder reset() {
		this.articleData = new ArticleData();
		return this;
	}

	@Override
	public ArticleBuilder setTitle(String title) {
		Title titleArt = new Title(title);
		articleData.setTitle(titleArt);
		return this;
	}

	@Override
	public ArticleBuilder setImageUrl(String imageUrl) {
		ImageUrl imgUrlArt = new ImageUrl(imageUrl);
		articleData.setImageUrl(imgUrlArt);
		return this;
	}

	@Override
	public ArticleBuilder setDescription(String description) {
		Description descriptionArt = new Description(description);
		articleData.setDescription(descriptionArt);
		return this;
	}

	@Override
	public ArticleBuilder setContent(String content) {
		Content contentArt = new Content(content);
		articleData.setContent(contentArt);
		return this;
	}

	@Override
	public ArticleBuilder setPerson(Person person) {
		articleData.setPerson(person);
		return this;
	}

	public Article getResult() {
		Article article = new Article();
		article.setArticleData(articleData);
		return article;
	}

}
