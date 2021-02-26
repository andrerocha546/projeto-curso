package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrerocha.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
