package com.andrerocha.projeto.builders;

public interface IArticleBuilder {
	
	IArticleBuilder reset();
	IArticleBuilder setTitle(String title);
	IArticleBuilder setImageUrl(String imageUrl);
	IArticleBuilder setDescription(String description);
	
}
