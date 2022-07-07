package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class ConvertsPoundsToKilos {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double pounds;
		double result;

		System.out.println("*** Converts Pounds to Kilos ***");
		System.out.print("Enter value in pounds: ");
		pounds = keyboard.nextDouble();
		result = convert(pounds);
		System.out.println(result + " kilos");
	}

	static double convert(double poundsIn) {
		return poundsIn / 2.2;
	}
}
