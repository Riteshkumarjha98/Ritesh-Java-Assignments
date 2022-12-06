package com.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluation.entities.Employees;

@Repository
public interface EmployeesDao extends JpaRepository <Employees, Integer>{

}

