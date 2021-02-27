package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerocha.projeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
