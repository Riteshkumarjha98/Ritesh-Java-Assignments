package com.usecases;

import java.util.Scanner;

import com.bean.Employee3;
import com.dao.Employee3Dao;
import com.dao.Employee3DaoImpl;
import com.exceptions.Employee3Exception;

public class Get_Employee3_By_Id {

	
public static void main(String[] args) throws Employee3Exception {
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eid");
		int Eid= sc.nextInt();

	
		Employee3Dao dao = new Employee3DaoImpl();
		
		Employee3 Employee3= dao.getEmployee3Byeid(Eid);
		
		
		System.out.println(Employee3);
		
		
		
		
		
	}

}
