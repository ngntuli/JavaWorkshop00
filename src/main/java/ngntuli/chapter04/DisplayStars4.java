package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class DisplayStars4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		char reply;

		do {
			System.out.println("Size of square?");
			num = keyboard.nextInt();

			while (num < 2 || num > 20) {
				System.out.print("Enter 2 or bigger but not than 20: ");
				num = keyboard.nextInt();
			}

			// display square
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			}

			System.out.print("Press [Y/N] to re run or quit the program: ");
			reply = keyboard.next().charAt(0);
		} while (reply == 'y' || reply == 'Y');
	}

}
