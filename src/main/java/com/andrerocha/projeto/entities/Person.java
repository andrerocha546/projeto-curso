package com.andrerocha.projeto.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.andrerocha.projeto.entities.data.personal.Email;
import com.andrerocha.projeto.entities.data.personal.Name;
import com.andrerocha.projeto.entities.data.personal.Password;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Embeddable
@Table(name = "tb_person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "is_admin", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
	private Name name;
	@Embedded
	private Email email;
	@Embedded
	private Password password;
	
	@OneToMany(mappedBy = "articleData.person")
	private List<Article> articles = new ArrayList<>();

	public Person() {
	}

	public Person(Name name, Email email, Password password) {
		this.id = null;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}
	
	public List<Article> getArticles() {
		return articles;
	}

	public Integer getId() {
		return id;
	}

}
