package com.evaluation.UseCases;

import javax.persistence.EntityManager;

import com.evaluation.Utility.EMUtil;
import com.evaluation.entities.Book;
import com.evaluation.entities.Book_Genre;

public class AddGenre {

	 public static void main (String[] args) {
		 EntityManager em=EMUtil.provideEntityManager();
			
		  Book_Genre emp=new Book_Genre();
			
			emp.setGenre_id(1);
			emp.setGenre_name("Gitanjali");
			
			
			
			
			Book_Genre Bg= em.find(Book_Genre.class,1);
			
			if(Bg != null) {
				
				
				Bg.getBookList().add(emp);
			     emp.setBg(Bg);
			   
			  em.getTransaction().begin();
			
			  em.persist(Bg);
			 
			
			 em.getTransaction().commit();

			
			
			System.out.println("done...");
			
			}
	 }
}
