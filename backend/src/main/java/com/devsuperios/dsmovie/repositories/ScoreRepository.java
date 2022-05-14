package com.devsuperios.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dsmovie.entities.Score;
import com.devsuperios.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
