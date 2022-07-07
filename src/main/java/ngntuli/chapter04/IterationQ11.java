package main.java.ngntuli.chapter04;

public class IterationQ11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			if (i == 3 || i == 4) {
				for (int j = 1; j <= 6; j++) {
					System.out.print(" * ");
				}
			} else {
				for (int j = 1; j <= 3; j++) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

}
