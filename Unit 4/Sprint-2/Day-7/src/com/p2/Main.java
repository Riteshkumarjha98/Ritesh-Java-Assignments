package com.p2;

public class Main {
	public static void main (String[] args) {
		Hosteller F1=new Hosteller ( 10,"Ritesh",5000,1000);
		double remainingHostFee =F1.payFee(4000);
		System.out.println("Remaining Fees:-");
		System.out.println(remainingHostFee);
		
		System.out.println("=========================");
		DayScholar F2 = new DayScholar (11,"Shubham",4000,1000);
		double remaingScholarFee= F2.payFee(2000);
	     System.out.println(remaingScholarFee);
	}

}
class Student{
	int studId;
	String studName;
	double examFee;
	
	public void displayDetail() {
		System.out.println(this.studId);
		System.out.println(this.studName);
		System.out.println(this.examFee);
		
		
	}
	public double payFee(double amount) { //examfee argument
		double remaining =this.examFee-amount;
		return remaining;
		
	}
}

class DayScholar extends Student{
	double transportFee;

 DayScholar (int id ,String name,double fee, double transFee ){
	 
	 this.examFee=fee;
	 this.studId=id;
	 this.studName=name;
	 this.transportFee=transFee;
	 
 }
 
public  double payFee(double amount) {
	 double remaining= this.examFee+this.transportFee-amount;{
		 return remaining;
	 }
 }
 
	
}

class Hosteller extends Student{
	double hostelFee;
	 Hosteller (int id ,String name,double fee, double HostFee ){
		 
		 this.examFee=fee;
		 this.studId=id;
		 this.studName=name;
		 this.hostelFee=HostFee;
		 
	 }
	 public  double payFee(double amount) {
		 double remaining= this.examFee+this.hostelFee-amount;{
			 return remaining;
		 }
	 }
	
	
	
}






















