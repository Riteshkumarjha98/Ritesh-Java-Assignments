package com.p2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
  public static void main(String[]args) {
	  Set<Song> m1 =new LinkedHashSet<>();
	  
	  PlayList p1 = new PlayList();
	  
	 p1.addSong(new Song("Tum Ho "));
	 p1.addSong(new Song("Lost "));
	 p1.addSong(new Song("We Don't Talk Anymore"));
	 p1.addSong(new Song("Catch Me OutSide "));
	 p1.addSong(new Song("Rabb Wangu"));
	 p1.addSong(new Song("Parbona"));
	 p1.addSong(new Song("Tere Bin "));
	 p1.addSong(new Song("Tere Bin "));

	 
	 
	 
	 for (Song s:p1.songs) {
		 
		 m1.add(s);
	 }
	 
	  for(Song m:m1) {
		  
		  System.out.println(m.getSong());
		
		  
		  System.out.println("Song added to the playlist successfully.");
		  System.out.println("-----------------------");
	  }
  }
}
