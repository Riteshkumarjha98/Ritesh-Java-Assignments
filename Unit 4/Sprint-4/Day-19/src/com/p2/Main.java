package com.p2;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;

public class Main {
	public static void main (String[] args) {

		
		Map<String,String> lm = new LinkedHashMap<>();
		
		lm.put("Maharastra","Mumbai");
		lm.put("Bihar","Patna");
		lm.put("Telangana","Hyderabad");
		lm.put("Karnatka", "Bangalore");
		lm.put("UP","Lucknow");
	
	Set<Map.Entry<String,String>> set = lm.entrySet();
	
		for(Map.Entry<String,String> me: set) {
		
		System.out.println(me.getKey()+"-----"+ me.getValue());
     	
	
		
		}


	}

}

