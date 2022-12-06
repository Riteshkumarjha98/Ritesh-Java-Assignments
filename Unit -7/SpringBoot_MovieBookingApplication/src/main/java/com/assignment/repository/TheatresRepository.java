package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Theatres;


@Repository
public interface TheatresRepository extends JpaRepository<Theatres, Integer> {



}
