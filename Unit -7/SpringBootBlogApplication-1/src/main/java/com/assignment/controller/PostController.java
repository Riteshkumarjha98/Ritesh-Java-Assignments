package com.assignment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.assignment.service.PostServiceIntr;

import payload.PostDto;

@RestController
public class PostController {
  PostServiceIntr PostService;
  
  
  // Creating book
 	
      @PostMapping("/api/v1/posts")
      public ResponseEntity<PostDto> createPost( @RequestBody PostDto postDto){
        return new ResponseEntity<>(PostService.createPost(postDto), HttpStatus.CREATED);
	 
	  
	 }
	 
	 //Get By id
	 
      @GetMapping(value = "/api/v1/posts/{id}")
      public ResponseEntity<PostDto> getPostByIdV1(@PathVariable(name = "id") int id){
          return ResponseEntity.ok(PostService.getPostById(id));
      }
		
		
		
		
		//Update
		  @PutMapping("/api/v1/posts/{id}")
		    public ResponseEntity<PostDto> updatePost( @RequestBody PostDto postDto, @PathVariable(name = "id") int id){

		       PostDto postResponse = PostService.updatePost(postDto, id);

		       return new ResponseEntity<>(postResponse, HttpStatus.OK);
		    }
		
		
		
		 
		 // Deleting Book By Id
		  @DeleteMapping("/api/v1/posts/{id}")
		    public ResponseEntity<String> deletePost(@PathVariable(name = "id") int id){

		        PostService.deletePostById(id);

		        return new ResponseEntity<>("Post entity deleted successfully.", HttpStatus.OK);
		    }
  
	
}
