package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcAreaAndPerimeter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length;
		double height;
		double area;
		double perimeter;

		System.out.println("*** Calculate Area and Perimeter of Rectangle ***");
		System.out.print("Enter length: ");
		length = keyboard.nextDouble();
		System.out.print("Enter height: ");
		height = keyboard.nextDouble();

		area = calcArea(length, height);
		perimeter = calcPerimeter(length, height);

		System.out.println("Area = " + area);
		System.out.println("Perimeter = " + perimeter);
	}

	static double calcArea(double lengthIn, double heightIn) {
		return lengthIn * heightIn;
	}

	static double calcPerimeter(double lengthIn, double heightIn) {
		return (2 * lengthIn) + (2 * heightIn);
	}
}
