package com.assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.assignment.Utility.EMUtil;
import com.assignment.entities.Employee;


public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee>list = null;
		EntityManager em = EMUtil.provideEntityManager();
		
		  em.getTransaction().begin();
		  
		  String jpql = "select e from Employee";
		  
		  Query q = em.createQuery(jpql);
		  
		  list =q.getResultList();
		  
		  for(Employee y:list) {
			  System.out.println(y);
		  }
		  em.getTransaction().commit();
		  
		  em.close();
		  
		return list;
	}

	@Override
	public void save(Employee employee) {
		EntityManager em = EMUtil.provideEntityManager();
		
	  em.getTransaction().begin();
	  em.persist(employee);
	  em.getTransaction().commit();
	  
	  em.close();
		
	}

	
}
