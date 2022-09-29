package com.evaluation.dao;

import java.util.List;

import com.evaluation.entities.Book;
import com.evaluation.entities.Book_Genre;

public interface LibraryDao {

	boolean addBook(Book book);
	boolean addGenre(Book_Genre bookGenre);
	List<Book> getBooksByGenre(String genre) throws GenreNotFound;
	String updateAuthorName(String bookName, String authorName) throws BookNotFound;
	void removeGenre(String genre) throws GenreNotFound;
	void removeBook(String bookName) throws BookNotFound;
}
