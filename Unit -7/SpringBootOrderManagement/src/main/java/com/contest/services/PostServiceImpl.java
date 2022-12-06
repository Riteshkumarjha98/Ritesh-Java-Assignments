package com.contest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contest.exception.NotFoundException;


import com.contest.model.Post;
import com.contest.repository.PostRepository;
import com.contest.exception.PostException;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository PostRepo;

	@Override
	public Post createPost(Post Post) {
		// TODO Auto-generated method stub
		return PostRepo.save(Post);
	}

	@Override
	public Post updatePost(Integer id , Post Post) throws NotFoundException {
		// TODO Auto-generated method stub
		
	Optional<Post> optPost = PostRepo.findById(id);
	if(!optPost.isPresent())
		throw new NotFoundException("Post not found with id : " + id);
	
	   Post updatedPost =   optPost.get();
	   updatedPost.setTitle(Post.getTitle());
	   updatedPost.setDescription(Post.getDescription());
	   updatedPost.setLocation(Post.getLocation());
	   updatedPost.setFeeling_Activity(Post.getFeeling_Activity());
	   updatedPost.setDate(Post.getDate());
	   
	   
		
		return Post;
	}

	@Override
	public Post deletePosts(Integer id) throws NotFoundException {

		Post existingPosts= PostRepo.findById(id).orElseThrow(() -> new PostException("Posts Doesn't Exist with Id "+id));
		
		PostRepo.delete(existingPosts);
			
		 return existingPosts;
	}
	
	

	@Override
	public List<Post> getAllPostDetails() throws NotFoundException {
		
	    List<Post> Post = PostRepo.findAll();
		
					if(Post.size()>0)
						return Post;
					else 
						throw new NotFoundException("Post Not Found");
			}
	

	}



	


