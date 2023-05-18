package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies,Long>{

}
