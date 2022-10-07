package com.assignment.service;

import com.assignment.entities.Post;
import com.assignment.exception.NotFoundException;

import payload.PagedResponse;
import payload.PostResponse;


public interface PostServiceIntr {
	
	PagedResponse<Post> getAllPosts(int page, int size);

	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

	PagedResponse<Post> getPostsByCategory(Long id, int page, int size);

	PagedResponse<Post> getPostsByTag(Long id, int page, int size);

//	Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);
//
//	ApiResponse deletePost(Long id, UserPrincipal currentUser);
//
//	PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

	Post getPost(Long id);
	 



	


	



	
}
