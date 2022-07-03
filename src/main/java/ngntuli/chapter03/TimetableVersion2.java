package main.java.ngntuli.chapter03;

import java.util.Scanner;

public class TimetableVersion2 {
	public static void main(String[] args) {
		char group; // to store the tutorial group
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Lab Times***"); // display header
		System.out.println("Enter your group (A,B,C)");
		group = keyboard.next().charAt(0);

		switch (group) {
		case 'A':
		case 'a':
			System.out.println("10.00 a.m");
			break;
		case 'B':
		case 'b':
			System.out.println("1.00 p.m");
			break;
		case 'C':
		case 'c':
			System.out.println("11.00 a.m");
			break;
		default:
			System.out.println("No such group");
		}
	}
}
