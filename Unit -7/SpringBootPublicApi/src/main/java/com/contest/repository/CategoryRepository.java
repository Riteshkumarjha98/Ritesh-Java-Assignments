package com.contest.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.contest.model.Category;
import com.contest.model.User;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	
	
}
