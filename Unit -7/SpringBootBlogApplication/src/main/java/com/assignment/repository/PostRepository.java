package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
