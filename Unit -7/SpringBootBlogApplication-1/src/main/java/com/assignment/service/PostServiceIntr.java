package com.assignment.service;



import payload.PostDto;
import payload.PostResponse;


public interface PostServiceIntr {
	
//	PagedResponse<Post> getAllPosts(int page, int size);
//
//	PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);
//
//	PagedResponse<Post> getPostsByCategory(int id, int page, int size);


	

	    PostDto createPost(PostDto postDto);

	    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

	    PostDto getPostById(int id);

	    PostDto updatePost(PostDto postDto, int id);

	    void deletePostById(int id);
	 



	


	



	
}
