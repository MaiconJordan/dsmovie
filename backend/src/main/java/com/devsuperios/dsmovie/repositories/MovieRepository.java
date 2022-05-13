package com.devsuperios.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperios.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
