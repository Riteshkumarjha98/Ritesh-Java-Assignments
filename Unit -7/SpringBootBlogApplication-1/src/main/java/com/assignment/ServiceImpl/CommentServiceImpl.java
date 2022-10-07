package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import com.assignment.entities.Comment;
import com.assignment.entities.Post;
import com.assignment.exception.CommentException;
import com.assignment.exception.ResourceNotFoundException;
import com.assignment.repository.CommentRepository;
import com.assignment.repository.PostRepository;
import com.assignment.repository.UserRepository;

import com.assignment.service.CommentServiceIntr;




@Service
public class CommentServiceImpl implements CommentServiceIntr {
	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public Comment createNewComment(Comment Comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAllCommentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment deleteComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getCommentById(int id) throws CommentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment updateBook(int id, Comment Comment) {
		// TODO Auto-generated method stub
		return null;
	}


	    
	    
	

	 
   
		
	

}
