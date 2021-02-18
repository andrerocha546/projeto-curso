package com.andrerocha.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrerocha.projeto.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
