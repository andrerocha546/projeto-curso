package com.andrerocha.projeto.entities.data.article;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.entities.User;

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
	@Embedded
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	public ArticleData(Title title, Description description, ImageUrl imageUrl, Content content, Person person) {
		this.title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		this.content = content;
		this.person = person;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
