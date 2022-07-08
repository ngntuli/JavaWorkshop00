package main.java.ngntuli.chapter05;

import java.util.Scanner;

public class ConvertsTemperature {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char reply;

		do {
			System.out.println("*** Converts Temperature ***");
			System.out.println("[1] Celsius to Fahrenheit");
			System.out.println("[2] Fahrenheit to Celsius");
			System.out.println("[3] Quit");
			System.out.print("Enter choice: ");
			reply = keyboard.next().charAt(0);

			switch (reply) {
			case '1':
				option1();
				break;
			case '2':
				option2();
				break;
			case '3':
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Error: wrong input, choice [1-3]");
			}
		} while (reply != '3');
	}

	static void option1() {
		Scanner keyboard = new Scanner(System.in);
		double cel;
		double fah;

		System.out.print("Enter temperature in Celsius: ");
		cel = keyboard.nextDouble();

		while (cel < -273.15) {
			System.out.print("Error:too low, re-enter temperature in Celsius: ");
			cel = keyboard.nextDouble();
		}

		fah = ((9 * cel) / 5) + 32;
		System.out.println(fah + " degree");
	}

	static void option2() {
		Scanner keyboard = new Scanner(System.in);
		double cel;
		double fah;

		System.out.print("Enter temperature in Fahrenheit: ");
		fah = keyboard.nextDouble();

		while (fah < -459.67) {
			System.out.print("Error:too low, re-enter temperature in Fahrenheit: ");
			fah = keyboard.nextDouble();
		}

		cel = ((5 * (fah - 32)) / 9);
		System.out.println(cel + " degree");
	}

}
