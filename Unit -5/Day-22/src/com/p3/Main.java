package com.p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the File Name");
		String enterFileName = in.next();
		
		System.out.println("Enter the Character to be counted");
	    String enterChar = in.next();
	    
	    
	    PrintWriter out = new PrintWriter("E://"+enterFileName+".txt");
	    out.println("Hello Everyone how your coding class going on !");
	    
	    FileReader fr = new FileReader(f);
	    char[] chr = new char[(int)f.length()];
	    
	    
	    
	    
	    

	   
	}

}
