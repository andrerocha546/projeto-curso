package com.andrerocha.projeto.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrerocha.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
