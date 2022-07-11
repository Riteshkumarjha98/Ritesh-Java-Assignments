package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_without_address {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id ");
		int enteredId = sc.nextInt();
		
		System.out.println("Enter Employee Name ");
		String enteredName = sc.next();
		
		System.out.println("Enter Employee Salary");
		int enteredSalary = sc.nextInt();
		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Rkj@1998");	
      
		 java.sql.Statement st= conn.createStatement();
		 
        // PreparedStatement ps = conn.prepareCall("insert into employee(eid,name,salary) values(?,?,?)" );
	   
        int x = st.executeUpdate("insert into employee(eid,name,salary) values(?,?,?)" );
//         st.setInt(1,enteredId);
//	     ps.setString(2, enteredName);
//	     ps.setInt(3, enteredSalary);
		 
        
         
        if (x >0) {
        	
        	 
        	 System.out.println(x + "Inserted  into table");
         } 
        
         else {
        		 System.out.println(x + "Not inserted into table");
        	 }
        	 
         
//       if(conn != null)
//				System.out.println("connected");
//			else
//				System.out.println("not connected..");
				
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		 
	}
	
}
	
	

