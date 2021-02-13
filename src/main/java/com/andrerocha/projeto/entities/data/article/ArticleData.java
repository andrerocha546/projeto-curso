package com.andrerocha.projeto.entities.data.article;

public class ArticleData {
	
	private Title title;
	private Description description;
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
