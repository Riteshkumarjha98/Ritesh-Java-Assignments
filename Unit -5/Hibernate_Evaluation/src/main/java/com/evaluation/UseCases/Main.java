package com.evaluation.UseCases;

import javax.persistence.EntityManager;

import com.evaluation.Utility.EMUtil;
import com.evaluation.model.Department;
import com.evaluation.model.Employee;



public class Main {


	public static void main(String[] args) {
	
		EntityManager em=EMUtil.provideEntityManager();
		
		Department dept=new Department();
		dept.setDname("Marketing");
		dept.setLocation("Bangalore");
		
		
		Employee emp1=new Employee();
		
		emp1.setEname("Shubham");
		emp1.setSalary(5000);
		emp1.setDept(dept); //associating dept with emp1
		emp1.setAddress("Patna");
		
		Employee emp2=new Employee();
		emp2.setEname("Rohit");
		emp2.setSalary(2800);
		emp2.setDept(dept); //associating dept with emp1
		emp2.setAddress("Mumbai");
		
		Employee emp3 = new Employee();
		emp3.setEname("Anny");
		emp3.setSalary(7000);
		emp3.setDept(dept); //associating dept with emp1
		emp3.setAddress("Pune");
		

		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		dept.getEmps().add(emp3);
		
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();	
			
		System.out.println("done...");
		

	}
}
