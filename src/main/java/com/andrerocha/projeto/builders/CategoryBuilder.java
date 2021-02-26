package com.andrerocha.projeto.builders;

import com.andrerocha.projeto.entities.Category;
import com.andrerocha.projeto.entities.data.article.CategoryName;

public class CategoryBuilder {
	
	private Category category = new Category();
	
	public CategoryBuilder reset() {
		this.category = new Category();
		return this;
	}
	
	public CategoryBuilder setName(String name) {
		CategoryName catName = new CategoryName(name);
		this.category.setName(catName);
		return this;
	}
	
	public CategoryBuilder setParentId(Category category) {
		this.category.setParentId(category);
		return this;
	} 
	
	public Category getResult() {
		return this.category;
	}

}
