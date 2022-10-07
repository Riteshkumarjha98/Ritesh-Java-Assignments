package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
   
}