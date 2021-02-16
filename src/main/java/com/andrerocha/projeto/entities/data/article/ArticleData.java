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
	
	public ArticleData(Title title, Description description, ImageUrl imageUrl) {
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
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
	
}
