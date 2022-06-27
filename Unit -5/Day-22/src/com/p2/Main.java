package com.p2;

import java.io.*;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) throws IOException {
		
		File f = new File("E://abc.txt");
		
		FileReader fr =new FileReader("E://abc.txt");
		char[] chr = new char[(int)f.length()];
		 
		fr.read(chr);
		
		for(char c:chr) {
			System.out.print(c);
			
		}
     
		
	}
	}