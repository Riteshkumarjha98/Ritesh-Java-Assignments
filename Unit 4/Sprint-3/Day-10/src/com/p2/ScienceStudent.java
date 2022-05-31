package com.p2;



public class ScienceStudent extends Student{
	


	int physicsMarks;
	int chemistryMarks;
	int mathMarks;
	
	

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhyicsMarks(int phyicsMarks) {
		this.physicsMarks = phyicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	
	public ScienceStudent(String name, String address) {
		super(name, address);
		
	}

	@Override
	public double getPercentage() {

		
//		  (marks)300 * 100/ 500(totalSub)
		
		double percentages = (getPhysicsMarks() + getChemistryMarks() + getMathMarks()) * 100/300;
		return percentages;
	}
	
	

}
