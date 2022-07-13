package main.java.ngntuli.chapter06;

import java.util.Scanner;

public class TemperatureReadings3 {
	public static void main(String[] args) {
		double[] temperature;
		temperature = enterTemps();
		displayTemps(temperature);
		wasHot(temperature);
	}

	static double[] enterTemps() {
		Scanner keyboard = new Scanner(System.in);
		double[] temperatureOut = new double[7];
		for (int i = 0; i < temperatureOut.length; i++) {
			System.out.println("enter max temperature for day " + (i + 1));
			temperatureOut[i] = keyboard.nextDouble();
		}
		return temperatureOut;
	}

	static void displayTemps(double[] temperatureIn) {
		System.out.println();
		System.out.println("***TEMPERATURES ENTERED***");
		System.out.println();
		for (int i = 0; i < temperatureIn.length; i++) {
			System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
		}
	}

	static void wasHot(double[] temperature) {
		System.out.println();
		System.out.println("***Days that were hot***");
		System.out.println();
		for (int i = 0; i < temperature.length; i++) {
			if (temperature[i] >= 18) {
				System.out.println("day " + (i + 1) + " was a hot day");
			}
		}
	}
}
