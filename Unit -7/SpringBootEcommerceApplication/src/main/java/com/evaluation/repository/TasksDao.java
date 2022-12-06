package com.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluation.entities.Tasks;


@Repository
public interface TasksDao extends JpaRepository <Tasks, Integer>{

}
