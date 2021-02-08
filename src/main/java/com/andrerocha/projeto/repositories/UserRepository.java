package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrerocha.projeto.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
