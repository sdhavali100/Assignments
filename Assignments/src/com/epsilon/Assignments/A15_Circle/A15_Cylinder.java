package src.com.epsilon.Assignments.A15_Circle;

import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class A15_Cylinder extends A15_Circle{

	private double height = 1.0f;

	public double getVolume() {
		return getArea()*this.height;
	}

	public A15_Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	public A15_Cylinder(double radius,double height,String color) {
		super(radius,color);
		this.height = height;
	}

	public static void main(String[] args) {
		A15_Cylinder cylinder = new A15_Cylinder(5,5,"Red");
		System.out.println("Volume = "+cylinder.getVolume());
	}

}
