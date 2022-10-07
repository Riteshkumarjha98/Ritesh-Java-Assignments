package com.assignment.service;

import java.util.List;


import com.assignment.entities.Comment;
import com.assignment.exception.CommentException;
import com.assignment.exception.ResourceNotFoundException;

public interface CommentServiceIntr {
	

	
    public Comment createNewComment(Comment Comment);
	
	public List<Comment> getAllCommentDetails();
	
	public Comment deleteComment(int id);
          
	Comment getCommentById(int id) throws CommentException;

	Comment updateBook(int id, Comment Comment);
	
	
	
}
