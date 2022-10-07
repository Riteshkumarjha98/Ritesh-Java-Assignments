package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import com.assignment.entities.Comment;
import com.assignment.entities.Post;
import com.assignment.exception.CommentException;
import com.assignment.exception.NotFoundException;
import com.assignment.repository.CommentRepository;
import com.assignment.repository.PostRepository;
import com.assignment.repository.UserRepository;
import com.assignment.service.CommentDto;
import com.assignment.service.CommentServiceIntr;




@Service
public class CommentServiceImpl implements CommentServiceIntr {
	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public CommentDto createComment(long postId, CommentDto commentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommentDto> getCommentsByPostId(long postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto getCommentById(Long postId, Long commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComment(Long postId, Long commentId) {
		// TODO Auto-generated method stub
		
	}
	    
	    
	

	 
   
		
	

}
