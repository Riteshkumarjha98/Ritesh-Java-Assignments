package com.p3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//	Stadium[] std = Stadium.values();
	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Stadium Name");
			
			String enterStadiumName=input.next();
			
			IPL stadium = new IPL();
			
			Stadium s1 = Stadium.valueOf(enterStadiumName);
			stadium.homeTeamStadium(s1);
			
			
			
			
}
	
}
