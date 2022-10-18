package com.assignment.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.assignment.entities.Comment;
import com.assignment.entities.Post;
import com.assignment.exception.ResourceNotFoundException;
import com.assignment.repository.CommentRepository;
import com.assignment.repository.PostRepository;
import com.assignment.service.CommentServiceIntr;

import payload.CommentDto;

@Service
public class CommentServiceImpl implements CommentServiceIntr {

	
	  private CommentRepository commentRepository;
	    private PostRepository postRepository;
	    private ModelMapper mapper;
	    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository, ModelMapper mapper) {
	        this.commentRepository = commentRepository;
	        this.postRepository = postRepository;
	        this.mapper = mapper;
	    }

	@Override
	public CommentDto createComment(int postId, CommentDto commentDto) {
		   Comment comment = mapToEntity(commentDto);

	      Post post = postRepository.findById(postId).orElseThrow(
	                () -> new ResourceNotFoundException("Post", "id", postId));

	        // set post to comment entity
	        comment.setPost(post);

	        // comment Entity to DB
	        Comment newComment =  commentRepository.save(comment);

	        return mapToDTO(newComment);
	}

	@Override
	public List<CommentDto> getCommentsByPostId(int postId) {
		
        List<Comment> comments = CommentRepository.findByPostId(postId);

        // comment entities to list of comment dto's
        return comments.stream().map(comment -> mapToDTO(comment)).collect(Collectors.toList());
	}

	@Override
	public CommentDto getCommentById(int postId, int commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentDto updateComment(int postId, int commentId, CommentDto commentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComment(int postId, int commentId) {
		// TODO Auto-generated method stub
		
	}
	
    private CommentDto mapToDTO(Comment comment){
        CommentDto commentDto = mapper.map(comment, CommentDto.class);

        return  commentDto;
    }

    private Comment mapToEntity(CommentDto commentDto){
        Comment comment = mapper.map(commentDto, Comment.class);

        return  comment;
    }

	
    
}