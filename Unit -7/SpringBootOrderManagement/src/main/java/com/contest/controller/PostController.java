package com.contest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contest.exception.NotFoundException;
import com.contest.model.Post;
import com.contest.services.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService PostServices;
	
	
	@PostMapping(value = "/Post")
	public ResponseEntity<com.contest.model.Post> createPostHandler(@RequestBody Post Post){
		
		Post createdPost = PostServices.createPost(Post);
		
		return new ResponseEntity<>(createdPost,HttpStatus.CREATED);
	
	}
	
	 // Deleting Posts By Id
	
	 @DeleteMapping("/Post/{Id}")
	 public Post deletePosts(@PathVariable int Id) throws NotFoundException {
		 return this.PostServices.deletePosts(Id);
		 
	 }
	 
		@PutMapping(value ="/Post/{id}")
		public ResponseEntity<Post> updatePostHandler(@PathVariable int id, @RequestBody Post Post) throws NotFoundException{
			
		  Post updatedPost = PostServices.updatePost(id, Post);
			
			return new ResponseEntity<Post>(updatedPost,HttpStatus.ACCEPTED);
			
		}
		
		
		
		@GetMapping("/Post")
		public List<Post> getPost() throws NotFoundException{
		   return this.PostServices.getAllPostDetails();
		}
		
	 

}
