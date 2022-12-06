package com.contest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.contest.model.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {



}

