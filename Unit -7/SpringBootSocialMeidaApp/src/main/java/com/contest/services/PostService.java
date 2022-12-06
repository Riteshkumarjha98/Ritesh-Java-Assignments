package com.contest.services;


import java.util.List;

import com.contest.exception.NotFoundException;
import com.contest.model.Post;

public interface PostService {
   
	public Post createPost(Post Post);
	
	public Post updatePost(Integer id, Post Post) throws NotFoundException;
	
	public Post deletePosts(Integer id)  throws NotFoundException;
	
	public List<Post> getAllPostDetails() throws NotFoundException;
}
