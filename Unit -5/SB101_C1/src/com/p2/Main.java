package com.p2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main (String[]args) throws IOException, ClassNotFoundException {
		
		Employee s = new Employee(12,"Ritesh", new Address( "Patna", "Bihar", "India"), "soumritjha@gmail.com","Anny@1998" );
	
	
	//seriliazable
   FileOutputStream fos= new FileOutputStream("src/com/p2/student.txt");
	ObjectOutputStream out = new ObjectOutputStream(fos);
		
	out.writeObject(s);
	out.close();
	System.out.println("Sucess");
	
//deserialize
	     FileInputStream fis = new FileInputStream("src/com/p2/student.txt");
		ObjectInputStream ois = new  ObjectInputStream(fis);
		
		Employee obj =  (Employee) ois.readObject();
	      System.out.println(obj);
		   out.close();

		 
	}

}



