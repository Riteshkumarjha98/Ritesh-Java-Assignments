package com.p4;

import java.util.Scanner;

class Bank {
	String branchName;
	String IfscCode;
	
	void displayDetails() {
		System.out.println("Branch Name : "+ branchName);
		System.out.println("Ifsc Code : "+ IfscCode);
		
		
	}
}

class ICICIBank extends Bank{
	double rateofInterest;
	

	@Override
	void displayDetails() {
	
	System.out.println("Branch Name :" + branchName);
	System.out.println("Ifsc Code : " + IfscCode);
	System.out.println("Rate of Interest" + rateofInterest);
	System.out.println("Rate of Interest is " + rateofInterest + "%");
	
	}
	
	
}

class AxisBank extends Bank{
	double rateofInterest;
	
	

	@Override
	void displayDetails() {
	System.out.println("Branch Name : " + branchName);
	System.out.println("Ifsc Code : " + IfscCode);
	System.out.println("Rate of Interest" + rateofInterest);
	
	
	
	
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

  class Demo{
	  public static Bank getBank(String bank) {
		
			Scanner in = new Scanner(System.in);
			
			if(bank.equals("axis")) {
				AxisBank b1 = new AxisBank();
				System.out.print("Enter your IFSC Code : ");
				b1.IfscCode = (in.next());
				System.out.print("Enter your branch name : ");
				b1.branchName = in.next();
				System.out.print("Enter your rate of interest : ");
				b1.rateofInterest = in.nextDouble();
				System.out.println();
				System.out.println("-----------------------");
				return b1;
				
			}
			else if(bank.equals("icici")) {
				ICICIBank b1 = new ICICIBank();
				System.out.print("Enter your IFSC Code : ");
				b1.IfscCode = (in.next());
				System.out.print("Enter your Branch name : ");
				b1.branchName = in.next();
				System.out.print("Enter Your Rate of Interest : ");
				b1.rateofInterest = in.nextDouble();
				return b1;
			}  
		  
		  
		  
		  else {
			  return null;
		  }
		  
		  
  }





 
  public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of the bank : ");
		String bankName = in.next();
		Bank UserAccount = getBank(bankName);
		
//		
		UserAccount.displayDetails();
		System.out.println();
		
		if(UserAccount instanceof AxisBank) {
			AxisBank account1 = (AxisBank)UserAccount;
			account1.getCreditCard();
		}

	  
}
}
