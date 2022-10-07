package com.assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entities.Book;
import com.assignment.exception.BookException;
import com.assignment.exception.NotFoundException;
import com.assignment.repository.BookDao;


@Service
public class BookServiceImpl implements BookServiceIntr{
	
	@Autowired
	private BookDao brDao;  //For Accessing JPA Repository
	

	@Override
	public Book createNewBook(Book book) {
		Book savedBook = brDao.save(book);
		   return savedBook;
	}
	
	

	@Override
	public List<Book> getAllBookDetails() throws NotFoundException {
		List<Book> Books = brDao.findAll();
		
		if(Books.size()>0)
			return Books;
		else 
			throw new BookException("Books Not Found");
	
		
	}

	@Override
	public Book deleteBook(Integer id) throws NotFoundException {
		
		Book existingBook= brDao.findById(id).orElseThrow(() -> new BookException("Book Doesn't Exist with Id "+id));
		
		brDao.delete(existingBook);
			
		 return existingBook;
	}

	

	@Override
	public Book updateBook(Integer id, Book book) throws NotFoundException {
	
		
		 Optional<Book> foundBook =  brDao.findById(id);
		 
		 if(!foundBook.isPresent())
			 throw new NotFoundException("Book not found to update with " + id);
		 
		 Book updateBook = foundBook.get();
		 
		 updateBook.setAuthor(book.getAuthor());
		 updateBook.setBook_ID(book.getBook_ID());
		 updateBook.setCategory(book.getCategory());
         updateBook.setName(book.getName());
         updateBook.setPages(book.getPages());
         updateBook.setPrice(book.getPrice());
         updateBook.setPublication(book.getPublication());
         
		 return brDao.save(updateBook);
	}
	

	

	@Override
	public Book getBookById(Integer id) throws BookException{
		
	   Optional<Book> opt = brDao.findById(id);
		 
	    if(opt.isPresent()) {
	    	return opt.get();
	    }else
	    	throw new BookException("Book Doesn't Exist With Id :" + id);
	}




	

//	@Override
//	public Book updateBook(Book Book) throws BookException {
//		
//     Optional<Book> opt= brDao.findById(Book.getBook_ID());
//		
//		if(opt.isPresent()) {
//			
//		return brDao.save(Book);
//	
//		} else
//			throw new BookException("Invalid Book Details");
//	}
//

	


	
}
