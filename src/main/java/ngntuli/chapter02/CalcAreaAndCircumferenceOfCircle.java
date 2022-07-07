package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcAreaAndCircumferenceOfCircle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double PI = 3.1416;
		double radius = 0.0;
		double area;
		double circumference;
		int reply;

		System.out.println("*** Calculate Area and Circumference of a Circle ***");

		do {
			System.out.println();
			System.out.println("*****************");
			System.out.println("[1] Set radius");
			System.out.println("[2] Display radius");
			System.out.println("[3] Display area");
			System.out.println("[4] Display perimeter");
			System.out.println("[5] Quit");
			System.out.println("*****************");
			System.out.print("Enter your choice: ");
			reply = keyboard.nextInt();

			switch (reply) {
			case 1:
				System.out.print("Enter value for the radius of a circle: ");
				radius = keyboard.nextDouble();

				while (radius <= 0.0) {
					System.out.print("Enter value for the radius of a circle: ");
					radius = keyboard.nextDouble();
				}
				break;
			case 2:
				if (radius <= 0.0) {
					System.out.print("Set radius first");
				} else {
					System.out.print("Radius = " + radius);
				}
				break;
			case 3:
				area = PI * (radius * radius);
				System.out.println("Area = " + area);
				break;
			case 4:
				circumference = 2 * PI * radius;
				System.out.println("Circumference = " + circumference);
				break;
			case 5:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Error: wrong input, choice [1-5] ");

			}
		} while (reply != 5);

	}

}
