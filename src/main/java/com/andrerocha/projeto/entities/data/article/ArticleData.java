package com.andrerocha.projeto.entities.data.article;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class ArticleData {

	@Embedded
	private Title title;
	@Embedded
	private Description description;
	@Embedded
	private ImageUrl imageUrl;
	@Embedded
	private Content content;

	public ArticleData(Title title, Description description, ImageUrl imageUrl, Content content) {
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		this.content = content;
	}

	public ArticleData() {
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public ImageUrl getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(ImageUrl imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

}
