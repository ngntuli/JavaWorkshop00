package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class IterationQ03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;

		System.out.print("Enter a number:");
		num = keyboard.nextInt();

		for (int i = 1; i < num; i++) {
			System.out.println("YES");
			System.out.println("NO");
		}
		System.out.println("OK");
	}
}
