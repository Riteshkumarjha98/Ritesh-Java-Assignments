package com.p2;

import java.util.Objects;

public class Song {
	String song;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public int hashCode() {
		return Objects.hash(song);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(song, other.song);
	}
	
	public Song (String song) {
		this.song = song;
	}
	
	
	
}
