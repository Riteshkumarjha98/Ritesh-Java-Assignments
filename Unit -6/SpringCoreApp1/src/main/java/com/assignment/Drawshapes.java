package com.assignment;

public class Drawshapes {

	private Shapes shape;

 

	public Shapes getShape() {
		return shape;
	}



	public void setShape(Shapes shape) {
		this.shape = shape;
	}



	public void drawShape() {
		shape.draw();
	}
	
	
	
}
