package main.java.ngntuli.chapter04;

public class IterationQ12 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j + i < 4; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
