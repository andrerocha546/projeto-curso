package com.andrerocha.projeto.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerocha.projeto.entities.Person;

@Repository
@Primary
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
