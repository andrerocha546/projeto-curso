package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerocha.projeto.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
