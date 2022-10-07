package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entities.Post;

import com.assignment.exception.PostException;
import com.assignment.exception.ResourceNotFoundException;
import com.assignment.repository.PostRepository;
import com.assignment.service.PostServiceIntr;

import payload.PostDto;


@Service
public class PostServiceImpl implements PostServiceIntr {

	@Autowired
	private PostRepository postDao;
	
	
	
	@Override
	public PostDto createPost(PostDto postDto) {
		Post post = mapToEntity(postDto);
		Post newPost = postDao.save(post);
		
		  // convert entity to DTO
        PostDto postResponse = mapToDTO(newPost);
        return postResponse;
	}
	
	
	// convert Entity into DTO
    private PostDto mapToDTO(Post post){
        PostDto postDto = mapper.map(post, PostDto.class);
        return postDto;
    }

    // convert DTO to entity
    private Post mapToEntity(PostDto postDto){
        Post post = mapper.map(postDto, Post.class);
        return post;
    }




   //Get Post By Id
	  @Override
	    public PostDto getPostById(int id) {
	        Post post = postDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
	        return mapToDTO(post);
	    }

  //Delete Post By Id


    @Override
    public void deletePostById(int id) {
        // get post by id from the database
        Post post = postDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postDao.delete(post);
    }


	 //Update Post By Id
    @Override
    public PostDto updatePost(PostDto postDto, int id) {
        // get post by id from the database
        Post post = postDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getCategory());
        post.setContent(postDto.getBody());

        Post updatedPost = postDao.save(post);
        return mapToDTO(updatedPost);
    }


	
	
}
