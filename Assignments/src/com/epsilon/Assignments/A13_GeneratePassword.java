package src.com.epsilon.Assignments;

import java.util.Random;

public class A13_GeneratePassword {
	public static String generatePassword(int length) {

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "~!@#$%^&*";
		String values = Capital_chars + Small_chars + numbers + symbols;

		Random generate = new Random();

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i] = values.charAt(generate.nextInt(values.length()));

		}
		String result = new String(password);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("The Generated Password is " + generatePassword(10));
	}

}
