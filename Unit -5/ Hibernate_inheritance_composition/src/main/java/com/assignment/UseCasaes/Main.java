package com.assignment.UseCasaes;

import javax.persistence.EntityManager;

import com.assignment.Utility.EMUtil;
import com.assignment.entities.Address;
import com.assignment.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();

		Employee em1 = new Employee();
		em1.setName("Rohit");
		em1.setSalary(10000);
		em1.getAddrs().add(new Address("Delhi","Sonipat","520001","Home"));
		em1.getAddrs().add(new Address("Haryana","chandigarh","800020","Office"));

	
		Employee em2 = new Employee();
		em2.setName("Anny");
		em2.setSalary(12000);
		em2.getAddrs().add(new Address("Delhi","Sonipat","520001","Home"));
		em2.getAddrs().add(new Address("Haryana","chandigarh","800020","Office"));

		Employee em3 = new Employee();
		em3.setName("subham");
		em3.setSalary(9000);
		em3.getAddrs().add(new Address("Bangalore","HSR","520001","Home"));
		em3.getAddrs().add(new Address("Chandigarh","Amritsar","800020","Office"));

	
		Employee em4 = new Employee();
		em4.setName("Richa");
		em4.setSalary(8000);
		em4.getAddrs().add(new Address("Patna","Belly Road","520001","Home"));
		em4.getAddrs().add(new Address("Delhi","Noida","800020","Office"));

		em.getTransaction().begin();
		em.persist(em1);
		em.persist(em2);
		em.persist(em3);
		em.persist(em4);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done");
		
	}

}
