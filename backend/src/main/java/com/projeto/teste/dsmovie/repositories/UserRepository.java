package com.projeto.teste.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.teste.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
