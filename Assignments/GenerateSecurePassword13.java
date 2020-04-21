package com.epsilon.javaTraining.Assignments;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GenerateSecurePassword13 {

	private static final Random RANDOM = new SecureRandom();
	private static final String ALPHABET = "~!@#$%^&*0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int passwordLength = s.nextInt();

		// Generate Secure Password
		String password = generatePassword(passwordLength);

		// Print out password value
		System.out.println("Secure password: " + password);
	}

	public static String generatePassword(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}

		return new String(returnValue);
	}
}