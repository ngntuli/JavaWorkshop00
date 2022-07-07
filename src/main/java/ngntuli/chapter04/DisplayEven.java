package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class DisplayEven {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("*** Even numbers from 10 to 1 ***");
		System.out.print("Please enter a number: ");
		num = keyboard.nextInt();
		System.out.println();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}
}
