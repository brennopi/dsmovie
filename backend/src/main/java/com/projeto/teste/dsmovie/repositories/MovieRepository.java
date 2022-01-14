package com.projeto.teste.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.teste.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
