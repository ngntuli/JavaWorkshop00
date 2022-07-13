package main.java.ngntuli.chapter06;

import java.util.Scanner;

public class DisplayStudentsScores {

	public static void main(String[] args) {
		int[] javaStudents = enterExamMarks();
		increaseMarks(javaStudents);

		if (isAllHavePassed(javaStudents)) {
			System.out.println("All students have passed");
		} else {
			System.out.println("Some students failed");
		}

	}

	static int[] enterExamMarks() {
		Scanner keyboard = new Scanner(System.in);
		int[] javaStudents;
		int numberOfStudents;

		System.out.print("Enter a number of students: ");
		numberOfStudents = keyboard.nextInt();
		javaStudents = new int[numberOfStudents];

		for (int i = 0; i < javaStudents.length; i++) {
			System.out.print("Enter marks for student " + (i + 1) + ": ");
			javaStudents[i] = keyboard.nextInt();
		}

		return javaStudents;
	}

	static void increaseMarks(int[] javaStudents) {
		for (int i = 0; i < javaStudents.length; i++) {
			javaStudents[i] = javaStudents[i] + 5;
		}
	}

	static boolean isAllHavePassed(int[] javaStudents) {
		for (int mark : javaStudents) {
			if (mark < 40) {
				return false;
			}
		}
		return true;
	}

}
