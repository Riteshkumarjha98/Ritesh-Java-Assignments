package com.assignment.Utiltity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static{
		    emf=Persistence.createEntityManagerFactory("Account-unit");
	}
	
	public static EntityManager provideEntityManager(){
		
		return emf.createEntityManager();
	}
}
