package com.assignment.ServiceImpl;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.assignment.entities.Post;
import com.assignment.exception.ResourceNotFoundException;
import com.assignment.repository.PostRepository;
import com.assignment.service.PostServiceIntr;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import payload.PostDto;
import payload.PostResponse;


@Service
public class PostServiceImpl implements PostServiceIntr {

	    private PostRepository postRepository;

	    private ModelMapper mapper;

	    public PostServiceImpl(PostRepository postRepository, ModelMapper mapper) {
	          this.postRepository = postRepository;
	          this.mapper = mapper;
	    }
	    @Override
	    public PostDto createPost(PostDto postDto) {

	        // convert DTO to entity
	        Post post = mapToEntity(postDto);
	        Post newPost = postRepository.save(post);

	        // convert entity to DTO
	        PostDto postResponse = mapToDTO(newPost);
	        return postResponse;
	    }

	    @Override
	    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {

	        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
	                : Sort.by(sortBy).descending();

	        // create Pageable instance
	        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

	        Page<Post> posts = postRepository.findAll(pageable);

	        // get content for page object
	        List<Post> listOfPosts = posts.getContent();

	        List<PostDto> content= listOfPosts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

	        PostResponse postResponse = new PostResponse();
	        postResponse.setContent(content);
	        postResponse.setPageNo(posts.getNumber());
	        postResponse.setPageSize(posts.getSize());
	        postResponse.setTotalElements(posts.getTotalElements());
	        postResponse.setTotalPages(posts.getTotalPages());
	        postResponse.setLast(posts.isLast());

	        return postResponse;
	    }

	    @Override
	    public PostDto getPostById(int id) {
	        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
	        return mapToDTO(post);
	    }

	    @Override
	    public PostDto updatePost(PostDto postDto, int id) {
	        // get post by id from the database
	        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

	        post.setTitle(postDto.getTitle());
	        post.setDescription(postDto.getCategory());
	        post.setContent(postDto.getBody());

	        Post updatedPost = postRepository.save(post);
	        return mapToDTO(updatedPost);
	    }

	    @Override
	    public void deletePostById(int id) {
	        // get post by id from the database
	        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
	        postRepository.delete(post);
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
	
	
	
}
