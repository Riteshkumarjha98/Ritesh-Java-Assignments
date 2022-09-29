package com.evaluation.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book_Genre {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int genre_id;
	private String genre_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> bookList = new ArrayList<>();
	

	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Book_Genre [genre_id=" + genre_id + ", genre_name=" + genre_name + ", bookList=" + bookList + "]";
	}
	
	
}
