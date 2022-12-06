package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

   

}
