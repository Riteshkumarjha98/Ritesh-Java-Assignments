package com.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.List;

public class Main {
 
	
		 public static void main(String... args) { 
			 
      List<String> list = Arrays.asList("Patna","Hyderabad","Pune","Kolkata","Mumbai");
	   
        System.out.println("City List = "+list);
      
        Collections.sort(list, (String str1, String str2) -> str2.compareTo(str1));
		 
        System.out.println("Sorted City List = "+list);
		   }
		
	}

