package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.Person;

public interface ArticlesBuilder {
	
	ArticlesBuilder reset();
	ArticlesBuilder setTitle(String title);
	ArticlesBuilder setImageUrl(String imageUrl);
	ArticlesBuilder setDescription(String description);
	ArticlesBuilder setContent(String content);
	ArticlesBuilder setPerson(Person person);
	
}
