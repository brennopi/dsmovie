package com.projeto.teste.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.teste.dsmovie.entities.Score;
import com.projeto.teste.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
