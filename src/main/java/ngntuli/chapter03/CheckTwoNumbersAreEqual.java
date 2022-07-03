package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class CheckTwoNumbersAreEqual {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1;
		int num2;

		System.out.println("*** Check Numbers if they equal ***");
		System.out.print("Enter number 1: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter number 2: ");
		num2 = keyboard.nextInt();

		if (num1 == num2) {
			System.out.println("NUMBERS ARE EQUAL");
		} else {
			System.out.println("NUMBERS ARE NOT EQUAL");
		}

		if (num1 > num2) {
			System.out.println("FIRST NUMBER BIGGER");
		}

		if (num2 > num1) {
			System.out.println("SECOND NUMBER BIGGER");
		}
	}
}
