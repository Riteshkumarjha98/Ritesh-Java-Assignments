package com.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluation.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository <Employee, Integer>{

}

