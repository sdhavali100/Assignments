package com.epsilon.javaTraining.Assignments;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class AcceptInput18 {
	
	public static String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Enter the inputs");
		String nameString = getInput();
		if(nameString.equalsIgnoreCase("no")) {
			System.out.println("Thanks for using!!");
			System.exit(0);
		}
		else {
			
		}
		

	}
}
