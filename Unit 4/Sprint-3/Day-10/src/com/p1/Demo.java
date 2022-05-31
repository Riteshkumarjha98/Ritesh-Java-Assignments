package com.p1;

import java.util.Scanner;

public class Demo{
	
	public Hotel provideFood(int amount) {
		if(amount >= 1000) {
		   TajHotel hotel =  new TajHotel();
		   return hotel;
		}
		else if(amount > 200 && amount < 1000) {
			RoadSideHotel hotel =  new RoadSideHotel();
			return hotel;
		}else {
			
	   return null;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Amount");
		int enteredUserAmount = in.nextInt();
		
          Demo d1  = new Demo();
        
         
       if(d1.provideFood(enteredUserAmount) == null) {
    	   System.out.println("Please enter Valid Amount");
       }
       else {
    	  Hotel hotel =  d1.provideFood(enteredUserAmount);
    	    System.out.println("------------------------------");
         hotel.chickenBiryani();
         System.out.println("-----------------------------");
         hotel.masalaDosa();  
        
       }
       
      
     

		
	}
}