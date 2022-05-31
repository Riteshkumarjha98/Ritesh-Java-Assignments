package com.p2;

public class HistoryStudent extends Student{


	int historyMarks;
	int civicsMarks;

	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	
		
	
	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
	@Override
	public double getPercentage() {
		double percentages = (this.historyMarks + this.civicsMarks ) * 100/200;
		return percentages;
	}

}
