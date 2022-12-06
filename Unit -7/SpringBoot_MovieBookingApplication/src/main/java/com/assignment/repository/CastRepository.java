package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.model.Cast;

@Repository
public interface CastRepository extends JpaRepository<Cast, Integer> {



}
