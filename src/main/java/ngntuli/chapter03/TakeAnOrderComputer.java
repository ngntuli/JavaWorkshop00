package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class TakeAnOrderComputer {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double basicSystem = 375.99;
		double screen38cm = 75.99;
		double screen43cm = 99.99;
		double antivirus = 65.99;
		double printer = 125.00;
		double subTotal;
		double total;
		int input;

		System.out.println("*** Take an order fo a new computer ***");
		System.out.println("Basic System is " + basicSystem);
		System.out.println("Select \n1) Screen 38 cm = " + screen38cm);
		System.out.println("2) Screen 43 cm = " + screen43cm);
		input = keyboard.nextInt();

		if (input == 1) {
			subTotal = screen38cm;
		} else {
			subTotal = screen43cm;
		}

		subTotal = subTotal + basicSystem;
		System.out.println("SubTotal = " + subTotal);

		System.out.println("Extras are optional");
		System.out.println("1) Antivirus = " + antivirus + "\n2) Printer = " + printer + "\n3) Both \n4) Skip");
		input = keyboard.nextInt();

		if (input == 1) {
			subTotal = subTotal + antivirus;
		} else if (input == 2) {
			subTotal = subTotal + printer;
		} else if (input == 3) {
			subTotal = subTotal + printer + antivirus;
		}
		total = subTotal;
		System.out.println("Total cost = " + total);

	}
}
