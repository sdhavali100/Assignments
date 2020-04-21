package src.com.epsilon.Assignments.A15_Circle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class A15_Circle {

	private double radius;
	private String color;

	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}


	public A15_Circle(){
	}

	public A15_Circle(double radius) {
		this.radius = radius;
	}

	public A15_Circle(double radius, String color){
		this.color = color;
		this.radius = radius;
	}

}
