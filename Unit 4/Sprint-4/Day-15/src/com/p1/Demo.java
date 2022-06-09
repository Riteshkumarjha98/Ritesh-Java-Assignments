package com.p1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
	int dateOfBirthValidation(String dob) {
		
//		Scanner in = new Scanner(System.in);

		
		LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate c1 = LocalDate.now();
		Period p = Period.between(d1,c1);
		
	if( p.getYears()>0) {
	 return p.getYears();
	}else {
		
		System.out.println("Date should not be in Future");
		}
		
	}
		
	 public static void main(String[]args) {
		Demo d1 = new Demo();
     Scanner in = new Scanner(System.in);
     System.out.println("Enter Your Date Of Birth In This Matter : dd-mm-yyyy");
		String entereddob=in.next();
		try {
		int result =	d1.dateOfBirthValidation(entereddob);
		
		}
		catch(InvalidDateFormat e) {
			e.get()
		}
     
	}
	

}
