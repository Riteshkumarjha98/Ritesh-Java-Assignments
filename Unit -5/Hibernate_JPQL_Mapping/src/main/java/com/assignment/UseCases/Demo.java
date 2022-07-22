package com.assignment.UseCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.assignment.Utility.EMUtil;
import com.assignment.entities.Address;
import com.assignment.entities.Employee;

public class Demo {

	public static void main (String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your  Your Name: ");
		String name = sc.next();
		
		System.out.println("Enter Your Address of Your Gender: ");
		String gender = sc.next();
		
		System.out.println("Enter Employee Id: ");
		int empid = sc.nextInt();
		
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Enter Address of Your Home: ");
		
		
	
		System.out.println("Enter Your Country Name..!");
		String Home_Country =sc.next();
		
		System.out.println("Enter Your City Name..!");
		String Home_City = sc.next();
		
		System.out.println("Enter Your Pincode..!");
	    String Home_Pincode = sc.next();
	    
		System.out.println("Enter Your Address_Type");
		String Home_Type = sc.next();
//================================================================
		
		
	    System.out.println("Enter Address of Your Office: ");
	 
		
		System.out.println("Enter Your Country Name..!");
		String Office_Country =sc.next();
		
		System.out.println("Enter Your City Name..!");
		String Office_City = sc.next();
		
		System.out.println("Enter Your Pincode..!");
		String Office_Pincode = sc.next();
		
		System.out.println("Enter Your Address_Type");
		String Office_Type = sc.next();
	
		emp.setName(name);
		emp.setGender(gender);
		emp.setEmpId(empid);
		emp.setSalary(salary);
		
		
		
		
		emp.getEmpAddress().add(new Address(Home_Country,Home_City ,Home_Pincode,Home_Type));
		emp.getEmpAddress().add(new Address(Office_Country,Office_City,Office_Pincode,Office_Type));
		
//		emp.setName("Ritesh");
//		emp.setGender("Male");
//		emp.setEmpId(1);
//        emp.setSalary(10000);
//        
//        
//        emp.getEmpAddress().add(new Address("UP", "Varanasi","202221","Home"));
//     	emp.getEmpAddress().add(new Address("Karnatka","Bangalore","520001","Office"));
	
		em.getTransaction().begin();
		em.persist(emp);
        em.getTransaction().commit();
		
		System.out.println("done...");
		
	}
}
