package com.p1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo{
	
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
		 
		 System.out.println("Enter the date of birth in the format  :  dd/MM/yyyy   ");
		 String dob = input.next();
		 try {
			 
			LocalDate localdate = validateDate(dob);
			LocalDate currDate = LocalDate.now();
			
			if(currDate.isBefore(localdate)) {
				System.out.println("Date should not be in future");
			}
			else 
			{
				System.out.println("Age Of The USER : " + ChronoUnit.YEARS.between(localdate, currDate));
			}
		 }
		 
		 catch(InvalidDateFormat idf) {
			 
			 System.out.println("Invalid date format");
		 }
	}
}