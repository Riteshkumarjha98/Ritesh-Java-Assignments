package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entities.Post;
import com.assignment.exception.NotFoundException;
import com.assignment.exception.PostException;
import com.assignment.repository.PostRepository;
import com.assignment.service.PostServiceIntr;


@Service
public class PostServiceImpl implements PostServiceIntr {

	@Autowired
	private PostRepository postDao;
	
	
	// Creating New Post
	
	@Override
	public Post createNewPost(Post Post) {
		Post savedPost = postDao.save(Post);
		   return savedPost;
	}
	
	
  //List Of Post
	
	@Override
	public List<Post> getAllPostDetails() throws NotFoundException {
		List<Post> Posts = postDao.findAll();
		
		if(Posts.size()>0)
			return Posts;
		else 
			throw new PostException("Posts Not Found");
	
		
	}


   //Get Post By Id
	@Override
	public Post getPostById(long id) throws NotFoundException {

		   Optional<Post> opt = postDao.findById(id);
			 
		    if(opt.isPresent()) {
		    	return opt.get();
		    }else
		    	throw new PostException("Post Doesn't Exist With Id :" + id);
	}

  //Delete Post By Id

	@Override
	public Post deletePost(long id) throws NotFoundException {
       Post existingPost= postDao.findById(id).orElseThrow(() -> new PostException("Post Doesn't Exist with Id "+id));
		
		postDao.delete(existingPost);
			
		 return existingPost;
	}


	 //Update Post By Id

	@Override
	public Post updatePost(long id, Post Post) throws NotFoundException {
		Optional<Post> foundPost =  postDao.findById(id);
		 if(!foundPost.isPresent()) throw new NotFoundException("Post not found to update with " + id);
		 
		 Post updatePost = foundPost.get();
		 
	    
	     updatePost.setId(Post.getId());
		 updatePost.setTitle(Post.getTitle());
	//	 updatePost.setPost(Post.getPost());
		 updatePost.setBody(Post.getBody());
		 updatePost.setCreationDate(Post.getCreationDate());
		 
	           return postDao.save(updatePost);
	}



	
	
}
