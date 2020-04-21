package com.epsilon.javaTraining.Assignments;

public class Rectangle17 extends Shape17 {

	private double width = 1.0;
	private double length = 1.0;

	public Rectangle17(double width, double length) {
		this.length = length;
		this.width = width;
	}

	public Rectangle17(double width, double length, String colorString, boolean filled) {
		super(colorString, filled);
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * width * length;
	}

	public Rectangle17() {
		super();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public String toString() {
		return "Rectangle17 [width=" + width + ", length=" + length + ", getColorString()=" + getColorString()+
		"Area "+getArea()+"Perimeter "
		+ getPerimeter()	+ ", isFilled()=" + isFilled() + "]";
	}

	public void setLength(double length) {
		this.length = length;
	}

	
}
