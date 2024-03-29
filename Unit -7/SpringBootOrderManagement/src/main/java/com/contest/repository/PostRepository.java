package com.contest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contest.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {



}
