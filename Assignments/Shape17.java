package com.epsilon.javaTraining.Assignments;

public class Shape17 {

	private String colorString;
	private boolean filled;
	public Shape17() {
		super();
	}
	public Shape17(String colorString, boolean filled) {
		super();
		this.colorString = colorString;
		this.filled = filled;
	}
	public String getColorString() {
		return colorString;
	}
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "Shape17 [colorString=" + colorString + ", filled=" + filled + "]";
	}
	
	
	
	
}
