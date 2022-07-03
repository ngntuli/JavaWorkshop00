package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class GuessSumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1;
		int num2;
		int guess;
		int sum;

		System.out.println("***Two numbers required***");
		System.out.print("Enter number 1: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter number 2: ");
		num2 = keyboard.nextInt();
		System.out.print("Guess at the sum of these numbers[ " + num1 + " and " + num2 + " ]");
		guess = keyboard.nextInt();
		sum = num1 + num2;

		if (sum == guess) {
			System.out.println("WOW!!! CORRECT ANSWER");
		} else {
			System.out.println("I’M SORRY, INCORRECT ANSWER");
			System.out.println("THE CORRECT SUM IS = " + sum);
		}
	}
}
