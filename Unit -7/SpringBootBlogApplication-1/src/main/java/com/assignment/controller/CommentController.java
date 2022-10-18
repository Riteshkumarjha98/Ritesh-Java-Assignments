package com.assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.CommentServiceIntr;

import payload.CommentDto;

@RestController
public class CommentController {

	  private CommentServiceIntr commentService;

	    public CommentController(CommentServiceIntr commentService) {
	        this.commentService = commentService;
	    }
	    
	    //Creating Comment
	    
	    @PostMapping("/posts/{postId}/comments")
   public ResponseEntity<CommentDto> createComment(@PathVariable(value = "postId") int postId, @Valid @RequestBody 
		   CommentDto commentDto){
	                                                  
	        return new ResponseEntity<>(commentService.createComment(postId, commentDto), HttpStatus.CREATED);
	    }
	    
	    //List Of comment
	    
	    @GetMapping("/posts/{postId}/comments")
	    public List<CommentDto> getCommentsByPostId(@PathVariable(value = "postId") int postId){
	        return commentService.getCommentsByPostId(postId);
	    }
	    
	    
	    
	    
	    //Delete Comment
	    
	    @DeleteMapping("/posts/{postId}/comments/{id}")
	    public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") int postId,
	           @PathVariable(value = "id") int commentId){
	    	
	        commentService.deleteComment(postId, commentId);
	       return new ResponseEntity<>("Comment deleted successfully", HttpStatus.OK);
	    }
	    
	    
	    
}
