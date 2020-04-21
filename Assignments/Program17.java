package com.epsilon.javaTraining.Assignments;

public class Program17 {

	public static void main(String[] args) {
		Shape17[] shape= {
				new Circle17(4.3),
				new Circle17(4.3,"Red",false),
				new Circle17(4.3, "Blue", true),
				new Rectangle17(3, 4),
				new Rectangle17(3, 4,"Orange",true),
				new Rectangle17(4, 4,"Violet",false),
				new Rectangle17(8, 4,"Black", true),
				new Square17(4),
				new Square17(5,"Red",true),
				new Square17(6,"Blue",false)
		};	

		for (Shape17 shape17 : shape) {
			System.out.println(shape17);
		}
	}
}