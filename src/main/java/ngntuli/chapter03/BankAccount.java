package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount;
		double total;
		char account;
		boolean isSelected = true;

		System.out.println("*** Types of Accounts ***");
		System.out.print("Enter amount of money to deposit : ");
		amount = keyboard.nextDouble();
		System.out.println("Bank accounts\nA\nB\nC\nX");
		System.out.print("Enter your choice: ");
		account = keyboard.next().charAt(0);

		switch (account) {
		case 'A':
		case 'a':
		case 'C':
		case 'c':
			if (amount >= 250.0) {
				amount = amount * (1 + 1.5 / 100);
			} else {
				System.out.println("Minimum amount is 250");
				isSelected = false;
			}

			break;
		case 'B':
		case 'b':
			if (amount >= 1000.0) {
				amount = amount * (1 + 2.0 / 100);
			} else {
				System.out.println("Minimum amount is 1000");
				isSelected = false;
			}

			break;
		case 'X':
		case 'x':
			if (amount >= 5000.0) {
				amount = amount * (1 + 5.0 / 100);
			} else {
				System.out.println("Minimum amount is 5000");
				isSelected = false;
			}

			break;
		default:
			System.out.println("Error: no bank account chosen");
		}

		if (isSelected) {
			total = amount;
			System.out.println("Total of amount earned includes interest = " + total);
		} else {
			System.out.println("Error: your amount is insufficient");
		}

	}
}
