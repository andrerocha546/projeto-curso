package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrerocha.projeto.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
