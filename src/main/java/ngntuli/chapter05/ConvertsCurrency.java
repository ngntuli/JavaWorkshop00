package main.java.ngntuli.chapter05;

import java.util.Scanner;

public class ConvertsCurrency {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double sumOfMoney;
		double exchangeRate;
		double result;
		char reply;

		System.out.println("*** Converts money to another currency ***");

		do {
			System.out.println();
			sumOfMoney = sumOfmoney();
			exchangeRate = exchangeRate();
			result = convert(sumOfMoney, exchangeRate);
			displayResult(result, sumOfMoney);
			System.out.print("Press Y if you want to re run a program, or no to quit: ");
			reply = keyboard.next().charAt(0);
		} while (reply == 'y' || reply == 'Y');
	}

	static double sumOfmoney() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter sum of amount: ");
		return keyboard.nextDouble();
	}

	static double exchangeRate() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter exchange rate: ");
		return keyboard.nextDouble();
	}

	static double convert(double sumOfMoney, double exchangeRate) {
		return sumOfMoney / exchangeRate;
	}

	static void displayResult(double resultIn, double sumOfMoneyIn) {
		System.out.println(sumOfMoneyIn + " is = " + resultIn);
	}

}
