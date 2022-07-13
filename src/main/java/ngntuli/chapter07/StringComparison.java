package main.java.ngntuli.chapter07;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String string1;
		String string2;

		// get two strings from the user
		System.out.print("Enter a String: ");
		string1 = keyboard.next();
		System.out.print("Enter another String: ");
		string2 = keyboard.next();

		// compare the strings
		if (string1.trim().equalsIgnoreCase(string2.trim())) {
			System.out.println("The strings are identical");
		} else {
			System.out.println("The strings are NOT identical");
		}
	}
}
