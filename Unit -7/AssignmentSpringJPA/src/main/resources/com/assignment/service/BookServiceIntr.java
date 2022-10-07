package com.assignment.service;

import java.util.List;

import com.assignment.entities.Book;
import com.assignment.exception.BookException;
import com.assignment.exception.NotFoundException;

public interface BookServiceIntr {

	public Book createNewBook(Book book);
	
	public List<Book> getAllBookDetails() throws NotFoundException;
	
	public Book deleteBook(Integer id)  throws NotFoundException;
          
	public Book getBookById(Integer id) throws BookException;
    
	

	Book updateBook(Integer id, Book book) throws NotFoundException;
	
	 // public Book updateProduct(Book book)throws BookException;

	




	
}