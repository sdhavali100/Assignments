package com.epsilon.javaTraining.Assignments;


public class Circle17 extends Shape17 {
	
	private double radius=1.0;
	
	public Circle17() {
		super();
	}
	public Circle17(double radius) {
		this.radius=radius;	
	}
	
	@Override
	public String toString() {
		return "Circle17 [radius=" + radius + ", getColorString()=" + getColorString() + ", isFilled()=" + isFilled()+
		"Area "+getArea()+"Perimeter "
		+ getPerimeter()	+ "]";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle17( double radius,String colorString, boolean filled) {
		super(colorString, filled);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
}
