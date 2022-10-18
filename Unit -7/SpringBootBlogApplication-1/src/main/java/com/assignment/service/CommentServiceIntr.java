package com.assignment.service;

import java.util.List;




import payload.CommentDto;

public interface CommentServiceIntr {
	
	   CommentDto createComment(int postId, CommentDto commentDto);

	    List<CommentDto> getCommentsByPostId(int postId);

	    CommentDto getCommentById(int postId, int commentId);

	    CommentDto updateComment(int postId, int commentId, CommentDto commentRequest);

	    void deleteComment(int postId, int commentId);
	
   
	
	
	
}
