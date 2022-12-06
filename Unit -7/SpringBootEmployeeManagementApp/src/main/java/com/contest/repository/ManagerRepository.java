package com.contest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.contest.model.Manager;


@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {



}

