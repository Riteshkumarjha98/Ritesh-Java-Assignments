package com.assignment.UseCases;

import javax.persistence.EntityManager;

import com.assignment.Utility.EMUtil;
import com.assignment.model.Department;
import com.assignment.model.Employee;

public class Main {

 public static void main (String[] args) {
	 

	EntityManager em = EMUtil.provideEntityManager();
	
		Department d1 = new Department();
		d1.setDname("sales");
		d1.setLocation("kolkata");


		Department d2 = new Department();
		d2.setDname("Marketing");
		d2.setLocation("delhi");

		
		
		
		//creating employee without department
		Employee emp1 = new Employee();
		emp1.setEname("ram");
		emp1.setSalary(50000);
		emp1.setAddress("Pune");
	
		
		Employee emp2 = new Employee();
		emp2.setEname("dinesh");
		emp2.setSalary(30000);
		emp2.setAddress("Bangalore");
		
		//associating department with both employees(ram,dinesh) with dept sales
		emp1.getDeptList().add(d1);
		emp2.getDeptList().add(d1);
		
		//associating dept(sales) with both emp1 and emp2
		
		d1.getEmpList().add(emp1);
		d1.getEmpList().add(emp2);
		
		
		
		//assume dinesh is working in 2 dept(sales and marketing)
		emp2.getDeptList().add(d2);
		d2.getEmpList().add(emp2);
		
		
		
		em.getTransaction().begin();
		
		em.persist(d1);
		em.persist(d2);
		
		em.getTransaction().commit();

		System.out.println("done");
	}


	

 }

