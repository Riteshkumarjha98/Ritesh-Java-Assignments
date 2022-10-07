package com.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluation.entities.Tutorial;

@Repository
public interface TutorialDao extends JpaRepository <Tutorial, Integer>{

}

