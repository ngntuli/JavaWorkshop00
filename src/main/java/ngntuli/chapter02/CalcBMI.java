package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcBMI {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double weight;
		double height;
		double bmi;

		System.out.println("*** Calculate Body Mass Index (BMI) ***");
		System.out.print("Enter weight in kilos: ");
		weight = keyboard.nextDouble();
		System.out.print("Enter height in metres: ");
		height = keyboard.nextDouble();
		bmi = weight / (height * height);
		System.out.println("BMI = " + bmi);

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Healthy");
		} else {
			System.out.println("Overweight");
		}
	}
}
