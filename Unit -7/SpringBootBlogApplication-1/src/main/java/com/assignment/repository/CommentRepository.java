package com.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

	static List<Comment> findByPostId(int postId) {
		// TODO Auto-generated method stub
		return null;
	}
   
}