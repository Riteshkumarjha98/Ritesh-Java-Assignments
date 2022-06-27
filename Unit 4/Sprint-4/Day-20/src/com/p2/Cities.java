package com.p2;

public class Cities {
 
	String cities;

	public Cities(String cities) {
		super();
		this.cities = cities;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Cities [cities=" + cities + "]";
	}
	
	
}
