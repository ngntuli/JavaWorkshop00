package main.java.ngntuli.chapter07;

import java.util.ArrayList;

public class OblongTester2 {

	public static void main(String[] args) {
		int number;
		ArrayList<Oblong> rooms = new ArrayList<>();
		System.out.println("*** Dimensions of rooms ***");
		System.out.print("Enter number of rooms: ");
		number = EasyScanner.nextInt();
		addRooms(rooms, number);
		System.out.println("######################");
		displayRooms(rooms);
	}

	static void addRooms(ArrayList<Oblong> rooms, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println();
			System.out.println("Room" + (i + 1));

			System.out.print("Enter Length: ");
			double length = EasyScanner.nextDouble();

			System.out.print("Enter Height: ");
			double height = EasyScanner.nextDouble();

			rooms.add(new Oblong(length, height));
		}
	}

	static void displayRooms(ArrayList<Oblong> rooms) {
		for (int i = 0; i < rooms.size(); i++) {
			System.out.println();
			System.out.println("Room" + (i + 1));
			System.out.println("Length " + rooms.get(i).getLength());
			System.out.println("Height " + rooms.get(i).getHeight());
			System.out.println("Area " + rooms.get(i).calculateArea());
			System.out.println("Perimeter " + rooms.get(i).calculatePerimeter());
		}
	}
}
