package com.evaluation.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.evaluation.Utility.EMUtil;
import com.evaluation.entities.Book;
import com.evaluation.entities.Book_Genre;

public class LibraryDaoImpl implements LibraryDao {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addGenre(Book_Genre bookGenre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getBooksByGenre(String genre) throws GenreNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
		
			
			boolean result =false;
		
			
			EntityManager em= EMUtil.provideEntityManager();
			
			em.getTransaction().begin();
			
			em.merge(authorName);
			result=true;
			
			em.getTransaction().commit();
			
			
			em.close();
			
			return result;
		
		}

	

	@Override
	public void removeGenre(String genre) throws GenreNotFound {
		boolean result =false;
		
		
      genre=em.find(Book_Genre.class, genre);
		
		if(genre != null){
			
			em.getTransaction().begin();
			
			em.remove(acc);
			flag=true;
			
			em.getTransaction().commit();
		}
		
		em.close();
		
		
		
		return flag;
	}
		
	}

	@Override
	public void removeBook(String bookName) throws BookNotFound {
		// TODO Auto-generated method stub
		
	}
	

}
