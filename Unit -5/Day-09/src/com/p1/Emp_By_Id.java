package com.p1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Emp_By_Id {


	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		//Taking input from user for id
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee id to search ");
		  int enteredId = sc.nextInt();
		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Rkj@1998");	
		 
		
		 PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
		 ps.setInt(1, enteredId);
	
		ResultSet rs = ps.executeQuery();
			
		// Printing and getting data.
			if(rs.next()) {
				
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
	
				System.out.println("Employee Id = "+eid);
				System.out.println("Employee Name = "+name);
				System.out.println("Employee Address = "+address);
				System.out.println("Employee Salary = "+salary);
				System.out.println("============================");
			
			}
			else {
				System.out.println("Id does not exist please enter correct id");
			}
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		 
	}

}