package com.assignment.UseCases;

import java.util.List;

import javax.persistence.EntityManager;

import com.assignment.Utitlity.EMUtil;
import com.assignment.models.Department;
import com.assignment.models.Employee;

public class AddAnotherEmp {
     public static void main (String[] args) {
	 EntityManager em=EMUtil.provideEntityManager();
		
	  Employee emp=new Employee();
		
		emp.setEname("Arjun");
		emp.setSalary(3500);
		emp.setAddress("MadhyaP");
		
		Department dept= em.find(Department.class,1);
		
		if(dept != null) {
			
			 dept.getEmps().add(emp);
		   emp.setDept(dept);
		   
		  em.getTransaction().begin();
		
		  em.persist(dept);
		 
		
		 em.getTransaction().commit();

		
		
		System.out.println("done...");
		
		}
 }
}
