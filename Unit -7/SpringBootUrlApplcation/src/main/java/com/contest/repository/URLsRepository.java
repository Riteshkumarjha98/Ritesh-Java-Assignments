package com.contest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contest.model.URLs;


@Repository
public interface URLsRepository extends JpaRepository<URLs, Integer> {



}
