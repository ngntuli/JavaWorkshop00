package main.java.ngntuli.chapter06;

import java.util.Scanner;

public class ConvertsPriceOfProducts {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] products;
		double[] products2;
		int items;

		System.out.println("*** Prices of five products ***");
		System.out.print("How many items you wish to purchase: ");
		items = keyboard.nextInt();
		products = new double[items];
		priceOfProductsInRands(products);
		products2 = convertsPricesToUSD(products, exchangeRate());
		System.out.println();
		displayProductsPricesInRands(products);
		displayTotal(products);
		System.out.println();
		displayProductsPricesInUSD(products2);
		displayTotal(products2);
	}

	static void displayTotal(double[] products) {
		double total = 0.0;
		for (double price : products) {
			total = total + price;
		}
		System.out.println("Total = " + total);
	}

	static void priceOfProductsInRands(double[] products) {
		Scanner keyboard = new Scanner(System.in);
		double price;
		for (int i = 0; i < products.length; i++) {
			System.out.println("Product " + (i + 1));
			System.out.print("Enter price in Rands: ");
			price = keyboard.nextDouble();
			products[i] = price;
		}
	}

	static double exchangeRate() {
		Scanner keyboard = new Scanner(System.in);
		double exchangeRate;
		System.out.print("Enter exchange Rate: ");
		exchangeRate = keyboard.nextDouble();
		return exchangeRate;
	}

	static double[] convertsPricesToUSD(double[] products, double exchangeRate) {
		double[] products2 = new double[products.length];
		for (int i = 0; i < products2.length; i++) {
			products2[i] = products[i] / exchangeRate;
		}
		return products2;
	}

	static void displayProductsPricesInRands(double[] products) {
		System.out.println("USD Dollar to ZAR");
		for (double price : products) {
			System.out.println(price);
		}
	}

	static void displayProductsPricesInUSD(double[] products2) {
		System.out.println("ZAR to USD Dollar");
		for (double price : products2) {
			System.out.println(price);
		}
	}

}
