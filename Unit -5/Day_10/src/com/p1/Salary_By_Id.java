package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Salary_By_Id {
    

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id to search");
		int enteredId = sc.nextInt();
		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Rkj@1998");	
//         java.sql.Statement st= conn.createStatement();
		 
         PreparedStatement ps = conn.prepareCall("select * from employee where eid = ?" );
	     ps.setInt(1,enteredId);
		 
         ResultSet rs = ps.executeQuery();
         
         if (rs.next()) {
        	
        	 String name = rs.getString("name");
        	 int salary = rs.getInt("salary");
        	 
        
        	 System.out.println("Employee Name = "+name);
        	 System.out.println("Employee salary ="+salary);
         }
         
        
		 else
			 System.out.println("It's doesn't exist");
		 
	
				
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		 
	}
	
}
	