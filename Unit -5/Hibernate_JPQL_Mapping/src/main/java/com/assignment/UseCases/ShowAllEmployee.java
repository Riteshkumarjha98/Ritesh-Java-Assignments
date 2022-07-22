package com.assignment.UseCases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.assignment.Utility.EMUtil;
import com.assignment.entities.Employee;

public class ShowAllEmployee {

	public static void main (String[] args) {
      EntityManager em = EMUtil.provideEntityManager();
      String jpql = "select e from Employee";
      Query q = em.createQuery(jpql);
      
      List<Employee>list = q.getResultList();
      
      for(Employee empl :list) {
    	  System.out.println(empl.getName());
      }
		
	}
}

