package com.andrerocha.projeto.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.andrerocha.projeto.entities.data.article.CategoryName;

@Entity
@Table(name = "tb_category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Embedded
	private CategoryName name;
	@OneToOne
	@JoinColumn(name = "parent_id", referencedColumnName = "id")
	private Category parentId;
	@OneToMany(mappedBy = "articleData.category")
	private List<Article> articles = new ArrayList<Article>();

	public Category(CategoryName name, Category parentId) {
		this.id = null;
		this.name = name;
		this.parentId = parentId;
	}

	public Category() {
	}

	public CategoryName getName() {
		return name;
	}

	public void setName(CategoryName name) {
		this.name = name;
	}

	public Category getParentId() {
		return parentId;
	}

	public void setParentId(Category parentId) {
		this.parentId = parentId;
	}

	public Integer getId() {
		return id;
	}

	public List<Article> getArticles() {
		return articles;
	}

}
