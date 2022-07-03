package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class DisplayExamResult {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int mark;

		System.out.println("What exam mark did you get? ");
		mark = keyboard.nextInt();

		if (mark >= 70) {
			System.out.println("Congratulations, you passed with distinction");
		} else if (mark >= 40) {
			System.out.println("Congratulations, you passed");
		} else {
			System.out.println("I'm sorry, but you failed");
		}
		System.out.println("Good luck with your other exams");
	}
}
