package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrerocha.projeto.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
