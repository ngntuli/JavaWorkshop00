package main.java.ngntuli.chapter07;

public class OblongTester {

	public static void main(String[] args) {
		char reply;
		Oblong oblong1 = new Oblong(3.0, 4.0);
		Oblong oblong2 = new Oblong(5.0, 6.0);

		do {
			System.out.println();
			System.out.println("*** Set length and height of oblong ***");
			System.out.println("[1] Set oblong1");
			System.out.println("[2] Set oblong2");
			System.out.println("[3] Display area of oblong");
			System.out.println("[4] Quit");
			System.out.println();
			reply = EasyScanner.nextChar();
			switch (reply) {
			case '1':
				option(oblong1);
				break;
			case '2':
				option(oblong2);
				break;
			case '3':
				displayOblong(oblong1, oblong2);
				break;
			case '4':
				break;
			default:
				System.out.println("Options [1-4]");
			}
		} while (reply != '4');

	}

	static void displayOblong(Oblong... oblongs) {
		for (int i = 0; i < oblongs.length; i++) {
			System.out.println("The area of oblong" + (i + 1) + " is " + oblongs[i].calculateArea());
		}
	}

	static void option(Oblong oblong) {
		System.out.print("Enter length:");
		oblong.setLength(EasyScanner.nextDouble());
		System.out.print("Enter height:");
		oblong.setHeight(EasyScanner.nextDouble());
	}

}
