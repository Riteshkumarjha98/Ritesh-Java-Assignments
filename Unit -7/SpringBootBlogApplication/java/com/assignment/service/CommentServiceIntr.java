//package com.assignment.service;
//
//import java.util.List;
//
//
//import com.assignment.entities.Comment;
//import com.assignment.exception.CommentException;
//import com.assignment.exception.NotFoundException;
//
//import io.swagger.annotations.ApiResponse;
//
//import payload.CommentRequest;
//import payload.PagedResponse;
//
//public interface CommentServiceIntr {
//	
//
//	
////    public Comment createNewComment(Comment Comment);
////	
////	public List<Comment> getAllCommentDetails() throws NotFoundException;
////	
////	public Comment deleteComment(long id)  throws NotFoundException;
////          
////	Comment getCommentById(long id) throws CommentException;
////
////	Comment updateBook(long id, Comment Comment) throws NotFoundException;
//	
//	
//	PagedResponse<Comment> getAllComments(Long postId, int page, int size);
//
//	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);
//
//	Comment getComment(Long postId, Long id);
//
//	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);
//
//	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);
//}
