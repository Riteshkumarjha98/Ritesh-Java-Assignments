package com.masai.model;

public class Book {

	 Integer Book_ID;
	 String name;
	 String author;
	 Integer Price;
	
	
	
	 public Book() {
		 
	 }
	public Book(Integer book_ID, String name, String author, Integer price) {
		super();
		Book_ID = book_ID;
		this.name = name;
		this.author = author;
		Price = price;
	}
	public Integer getBook_ID() {
		return Book_ID;
	}
	public void setBook_ID(Integer book_ID) {
		Book_ID = book_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
//	public static void deleteBook(Integer book_Id2) {
//		// TODO Auto-generated method stub
//		   Book.removeIf(u -> u.getBook_Id().equals());	
//	}

	

	 
	
}
