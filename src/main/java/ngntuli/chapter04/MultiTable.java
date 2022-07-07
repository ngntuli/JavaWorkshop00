package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		char reply;

		do {
			System.out.println("*** Multiplication Table ***");
			System.out.print("Enter a number: ");
			num = keyboard.nextInt();

			while (num < 2) {
				System.out.println("Enter a number that is not less than 2");
				num = keyboard.nextInt();
			}

			for (int i = 1; i <= 12; i++) {
				System.out.println(i + " x " + num + " = " + i * num);
			}
			System.out.println("Enter [Y/N] if you want to run a program again");
			reply = keyboard.next().charAt(0);
		} while (reply == 'y' || reply == 'Y');
	}

}
