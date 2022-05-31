package com.p2;

 import java.util.Scanner;

 
public class AllStudent {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter Science Student Name: ");
		String enteredScienceStudName = in.nextLine();
		
		System.out.println("Enter Address of the Science : ");
		String enteredAddressOfScienceStud = in.nextLine();
		
		
		System.out.println("Enter Your Physics Marks");
		int enteredPhysicsMarks = in.nextInt();
		
		in.nextLine();
		System.out.println("Enter Your Chemistry Marks");
		int enteredChemMarks = in.nextInt();
		
		in.nextLine();
		System.out.println("Enter Your Maths Marks");
		int enteredMathsMarks = in.nextInt();
		
		
		ScienceStudent ScienceStud1 = new ScienceStudent(enteredScienceStudName, enteredAddressOfScienceStud);
		
		ScienceStud1.setMathMarks(enteredMathsMarks);

		ScienceStud1.setChemistryMarks(enteredChemMarks);
		ScienceStud1.setPhyicsMarks(enteredPhysicsMarks);
		
		System.out.println("Science Student Name : " + ScienceStud1);
		System.out.println("Science Student Percentage : " + ScienceStud1.getPercentage());
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Enter History Student Name : ");
		String enteredHistoryStudName = in.nextLine();
		
		in.nextLine();
		System.out.println("Enter History Student Address: ");
		String enteredAddressOfHistoryStud = in.nextLine();
		
		in.nextLine();
		System.out.println("Enter History Marks");
		int enteredHistoryMarks=in.nextInt();
		
		in.nextLine();
		System.out.println("Enter Your Civics Marks");
		int enteredCivicsMarks = in.nextInt();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		HistoryStudent historyStudent1 = new HistoryStudent(enteredHistoryStudName,enteredAddressOfHistoryStud);

		historyStudent1.setCivicsMarks(enteredCivicsMarks);
        historyStudent1.setHistoryMarks(enteredHistoryMarks);
       
       
       System.out.println("*********************************");
       System.out.println();
       System.out.println("History Student Name :" + historyStudent1.name);
       System.out.println("History Student Percentage is :" + historyStudent1.getPercentage());
      
	}

}
