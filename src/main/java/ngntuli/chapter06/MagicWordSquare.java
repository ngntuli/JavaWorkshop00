package main.java.ngntuli.chapter06;

public class MagicWordSquare {

	public static void main(String[] args) {
		char[][] magicSquare = { { 'P', 'R', 'E', 'Y' }, { 'L', 'A', 'V', 'A' }, { 'O', 'V', 'E', 'R' },
				{ 'T', 'E', 'N', 'D' }, };
		System.out.println("******************");
		displayRow(magicSquare);
		System.out.println("******************");
		System.out.println();
		System.out.println("******************");
		displayColumn(magicSquare);
		System.out.println("******************");
	}

	static void displayRow(char[][] magicSquare) {
		for (int i = 0; i < magicSquare.length; i++) {
			System.out.print("Row " + (i + 1) + ": ");
			for (int j = 0; j < magicSquare[i].length; j++) {
				System.out.print(magicSquare[i][j]);
			}
			System.out.println();
		}
	}

	static void displayColumn(char[][] magicSquare) {
		for (int i = 0; i < magicSquare.length; i++) {
			System.out.print("Column " + (i + 1) + ": ");
			for (int j = 0; j < magicSquare[i].length; j++) {
				System.out.print(magicSquare[j][i]);
			}
			System.out.println();
		}
	}

}
