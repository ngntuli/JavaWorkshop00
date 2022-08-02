package main.java.ngntuli.chapter08;

import java.util.Scanner;

public class StockItemTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboardString = new Scanner(System.in);

		String tempNumber;
		String tempName;
		double tempPrice;

		System.out.print("Enter the stock number: ");
		tempNumber = keyboardString.nextLine();
		System.out.print("Enter the name of the item: ");
		tempName = keyboardString.nextLine();
		System.out.print("Enter the price of the item: ");
		tempPrice = keyboard.nextDouble();

		System.out.println();
		StockItem item = new StockItem(tempNumber, tempName, tempPrice);

		item.increaseTotalStock(5);

		System.out.println("Stock Number = " + item.getTotalStock());

		System.out.println("Total Price = " + item.calculateTotalPrice());

		StockItem.setSalesTax(10);
	}

}
