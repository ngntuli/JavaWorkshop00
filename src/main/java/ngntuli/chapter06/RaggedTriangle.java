package main.java.ngntuli.chapter06;

import java.util.Scanner;

public class RaggedTriangle {

	public static void main(String[] args) {
		int max;
		int[][] triangle = new int[4][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];
		}
		enterNumbers(triangle);
		max = max(triangle);
		System.out.println("Max = " + max);
	}

	static void enterNumbers(int[][] triangle) {
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print("Enter number: ");
				triangle[i][j] = keyboard.nextInt();
			}
		}
	}

	static int max(int[][] triangle) {
		int max = triangle[0][0];
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				if (triangle[i][j] > max) {
					max = triangle[i][j];
				}
			}
		}
		return max;
	}

}
