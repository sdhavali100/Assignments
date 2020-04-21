package com.epsilon.javaTraining.Assignments;

public class Square17 extends Rectangle17 {

	private double side=1.0;
	
	public  Square17(double side) {
		super(side,side);
	}
	
	public  Square17(double side,String colorString, boolean filled	) {
		super(side,side,colorString,filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double width) {
		this.side=width;
	}
	
	public void setLength(double length) {
		this.side=length;
	}

	@Override
	public String toString() {
		return "Square17 [side=" + side + ", getWidth()=" + getWidth() + ", getLength()=" + getLength()
				+ ", getColorString()=" + getColorString() + ", isFilled()=" + isFilled() +"Area "+getArea()+"Perimeter "
				+ getPerimeter()+ "]";
	}
	
}
