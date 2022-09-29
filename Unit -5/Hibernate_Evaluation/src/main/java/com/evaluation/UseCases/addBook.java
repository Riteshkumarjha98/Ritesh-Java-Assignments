package com.evaluation.UseCases;

import javax.persistence.EntityManager;

import com.evaluation.Utility.EMUtil;
import com.evaluation.entities.Book;
import com.evaluation.entities.Book_Genre;



public class addBook {

	 public static void main (String[] args) {
		 EntityManager em=EMUtil.provideEntityManager();
			
		  Book emp=new Book();
			
			emp.setBook_id(1);
			emp.setAuthor_name("Gitanjali");
			emp.setAuthor_name("Rabindra Nath Tagore");
			
			
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
