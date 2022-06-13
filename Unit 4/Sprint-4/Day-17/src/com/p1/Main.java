package com.p1;

import java.util.LinkedHashSet;
import java.util.Set;

    public class Main {
	public static void main(String[] args) {
	 
		Set<Song> songList = new LinkedHashSet<Song>();
		
		Song p1 = new Song("Aaisue-2 ", "Tum Hi Ho");
		Song p2 = new Song("MS Dhoni","Khairiyat" );
		Song p3  = new Song("Desi Boys","Rabb Wangu");
		Song p4  = new Song("Tamasha","Agar Tum Sath Ho");
		 
		songList.add(p1);
		songList.add(p2);  // duplicate passing but it won't print.
		songList.add(p3);
		songList.add(p4);  
		
		for(Song p:songList) {
			p.play();
		}
		
		
		// Showing duplicate object 
	 System.out.println("p1 and p2 is duplicate : " + p1.equals(p2 )+ " so one will be remove from here");
		
		
	}

}
