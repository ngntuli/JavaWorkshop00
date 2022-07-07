package main.java.ngntuli.chapter04;

import java.util.Scanner;

public class IterationQ07 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		int square;

		System.out.print("Enter a number: ");
		num = keyboard.nextInt();
		System.out.print("Enter the square of this number: ");
		square = keyboard.nextInt();

		while (square != (num * num)) {
			System.out.println("Wrong answer, try again");
			square = keyboard.nextInt();
		}
		System.out.println("Well done, right answer");
	}

}
