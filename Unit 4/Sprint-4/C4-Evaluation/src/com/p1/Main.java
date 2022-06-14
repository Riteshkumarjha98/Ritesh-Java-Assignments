package com.p1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{

        static LocalDate validateDate(String dob) throws InvalidDateFormat {
		try {
			
			DateTimeFormatter DTF= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			LocalDate localdate = LocalDate.parse(dob,DTF);
			return localdate;
		}
		catch(DateTimeParseException e) {
			throw new InvalidDateFormat();
		}
	}
	public static void main(String[] args)  {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter The Date Of Birth In The Format  :  dd/MM/yyyy");
		 String dob = input.next();
		 try {
			 
			LocalDate localdate = validateDate(dob);
			LocalDate currDate = LocalDate.now();
			Period p = Period.between(localdate, currDate);
			
			if(currDate.isBefore(localdate)) {
				System.out.println("Date should not be in future");
			}
			if(p.getYears()>=18) {
				System.out.println("You are eligible to cast your vote");
				}
			if(localdate==currDate) {
				System.out.println("Happy Birthday, You are eligible to cast your vote.");
			}
			else 
			{
				System.out.println("");
			}
		 }
		 
		 catch(InvalidDateFormat idf) {
			 
			 System.out.println("please pass the date in the proper format");
		 }
	}
}