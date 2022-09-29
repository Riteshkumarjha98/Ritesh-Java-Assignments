package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

@RestController
public class MyController {

	//  Get All books information
	@GetMapping("/Books")
	public List<Book> getBooks(){
		List<Book> Book = new ArrayList<Book>();
		
		Book.add(new Book (1,"Gitanjali","Rabindra Nath Tagore", 500));
		Book.add(new Book (2,"One Night At Call Center","Chetan Bhagat", 200));
		Book.add(new Book (3,"A Passenger","E.M.Foster", 450));
		Book.add(new Book (4,"India Divided","Rajendra Prasad", 500));
		Book.add(new Book (5,"A Vision Of Indian Youth","APJ Abdul Kalam", 400));
		
		
		return Book;
	}
//==============================================================================================================	
	
	// Get the information of any particular book by id
	
	@GetMapping("/Book/{Book_ID}")
	public Book getBookHandler(@PathVariable("Book_ID") Integer Book_ID) {
		
		
		return new Book(Book_ID, "Gitanjali","Rabindra Nath Tagore", 500);
	
	}
	
//=============================================================================================================================
	
	@PostMapping(value = "/Book")
	public String New_Book(@RequestBody Book Book) {
	
	return "Book stored ,"+ Book.getName();
	}

//=====================================================================================================
	
	 @RequestMapping(value = "/Book/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable Integer Book_Id) {
//	      Book.deleteBook(Book_Id);
	 }
}
