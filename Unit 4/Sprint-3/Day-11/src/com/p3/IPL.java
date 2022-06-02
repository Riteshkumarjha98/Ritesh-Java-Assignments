package com.p3;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) {
		
		
		Scanner in = new Scanner(System.in);
	      switch (stadium){
	      case EDEN_GARDENS_STADIUM:
	    	  System.out.println("This is the home ground of KKR");
	     
	      break;
	      case WANKHEDE_STADIUM:
	    	  System.out.println("This is the home ground of Mumbai Indians");
	        break;
	      case CHIDAMBARAM_STADIUM:
	    	  System.out.println("This is the home ground of CSK");
	    	  break;
	    	  
	      case M_CHINNASWAMY_STADIUM:
	    	  System.out.println("This is the home ground of RCB");
	          break;
	      }
	}
}
