//package com.assignment.controller;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import com.assignment.entities.Post;
//import com.assignment.exception.NotFoundException;
//import com.assignment.exception.PostException;
//import com.assignment.service.PostServiceIntr;
//
//@RestController
//public class PostController {
//  PostServiceIntr PostService;
//  
//  
//  // Creating book
//	
//	 @PostMapping("/api/posts")
//	 public Post createNewBook(@RequestBody Post Post) {
//		 
//	  return this.PostService.createNewPost(Post);
//	  
//	 }
//	 
//	 
//	 
//		@GetMapping("/api/posts")
//		public List<Post> getpost() throws NotFoundException{
//		   return this.PostService.getAllPostDetails();
//		}
//		
//		
//		
//		 //Get Post By Id
//		  @GetMapping("/api/Posts/{id}")
//		   public Post getPostHandler(@PathVariable long id) throws PostException {
//			   return PostService.getPostById(id);
//		   }
//		
//		
//		@PutMapping(value ="/api/Posts/{id}")
//		public ResponseEntity<Post> updatePostHandler(@PathVariable long id, @RequestBody Post Post) throws NotFoundException{
//			
//		  Post updatedPost = PostService.updatePost(id, Post);
//			
//			return new ResponseEntity<Post>(updatedPost,HttpStatus.ACCEPTED);
//			
//		}
//		
//		
//		
//		 
//		 // Deleting Book By Id
//		 @DeleteMapping("/api/posts/{id}")
//		 public Post deletePost(@PathVariable int id) throws NotFoundException {
//			 return this.PostService.deletePost(id);
//			 
//		 }
//  
//	
//}
