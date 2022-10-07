package com.assignment.service;

import com.assignment.entities.Post;
import com.assignment.exception.ResourceNotFoundException;

import payload.PagedResponse;
import payload.PostDto;


public interface PostServiceIntr {
	
//	PagedResponse<Post> getAllPosts(int page, int size);
//
//	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);
//
//	PagedResponse<Post> getPostsByCategory(Long id, int page, int size);
//
//	PagedResponse<Post> getPostsByTag(Long id, int page, int size);
//
////	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);
////
////	ApiResponse deletePost(Long id, UserPrincipal currentUser);
////
////	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);
//
//	Post getPost(Long id);

	

	PostDto createPost(PostDto postDto);

	void deletePostById(int id);

	PostDto updatePost(PostDto postDto, int id);

	PostDto getPostById(int id);
	 



	


	



	
}
