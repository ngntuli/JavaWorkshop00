package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int gum = 0;
		int choc = 0;
		int popcorn = 0;
		int juice = 0;
		int reply;

		do {
			System.out.println("***************");
			System.out.println("[1] Get gum");
			System.out.println("[2] Get chocolate");
			System.out.println("[3] Get popcorn");
			System.out.println("[4] Get juice");
			System.out.println("[5] Display total sold so far");
			System.out.println("[6] Quit");
			System.out.println("***************");
			System.out.print("Enter your choice: ");
			reply = keyboard.nextInt();

			switch (reply) {
			case 1:
				System.out.println("Here is your gum");
				gum = gum + 1;
				break;
			case 2:
				System.out.println("Here is your chocolate");
				choc = choc + 1;
				break;
			case 3:
				System.out.println("Here is your popcorn");
				popcorn = popcorn + 1;
				break;
			case 4:
				System.out.println("Here is your juice");
				juice = juice + 1;
				break;
			case 5:
				System.out.println("*********************");
				System.out.println(gum + " items of gum sold");
				System.out.println(choc + " items of chocolate sold");
				System.out.println(popcorn + " items of popcorn sold");
				System.out.println(juice + " items of juice sold");
				System.out.println("*********************");
				break;
			case 6:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Error: options [1-6] only!");
			}
		} while (reply != 6);
	}

}
