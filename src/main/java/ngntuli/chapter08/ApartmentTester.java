package main.java.ngntuli.chapter08;

import main.java.ngntuli.chapter07.EasyScanner;
import main.java.ngntuli.chapter07.Oblong;

public class ApartmentTester {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        char reply;
        System.out.println("*** Apartment ***");
        do {
            System.out.println();
            System.out.println("[1] Add a room");
            System.out.println("[2] Room height");
            System.out.println("[3] Room length");
            System.out.println("[4] Room area");
            System.out.println("[5] Room perimeter");
            System.out.println("[6] Quit");
            System.out.println();
            reply = EasyScanner.nextChar();
            switch (reply) {
                case '1':
                    option1(apartment);
                    break;
                case '2':
                    option2(apartment);
                    break;
                case '3':
                    option3(apartment);
                    break;
                case '4':
                    option4(apartment);
                    break;
                case '5':
                    option5(apartment);
                    break;
                case '6':
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Options [1-6]");
            }
        } while (reply != '6');
    }

    private static void option1(Apartment apartment) {
        System.out.print("Enter length: ");
        double length = EasyScanner.nextDouble();

        System.out.print("Enter height: ");
        double height = EasyScanner.nextDouble();

        Oblong room = new Oblong(length, height);
        apartment.addRoom(room);
    }

    private static void option2(Apartment apartment) {
        int roomNumber;

        System.out.print("Enter room number: ");
        roomNumber = EasyScanner.nextInt();

        double room = apartment.getRoomHeight(roomNumber);

        if (room != -999) {
            System.out.println("Height = " + room);
        } else {
            System.out.println("Room do not exist");
        }
    }

    private static void option3(Apartment apartment) {
        int roomNumber;

        System.out.print("Enter room number: ");
        roomNumber = EasyScanner.nextInt();

        double room = apartment.getRoomLength(roomNumber);

        if (room != -999) {
            System.out.println("Length = " + room);
        } else {
            System.out.println("Room do not exist");
        }
    }

    private static void option4(Apartment apartment) {
        int roomNumber;

        System.out.print("Enter room number: ");
        roomNumber = EasyScanner.nextInt();

        double room = apartment.getRoomArea(roomNumber);

        if (room != -999) {
            System.out.println("Area = " + room);
        } else {
            System.out.println("Room do not exist");
        }
    }

    private static void option5(Apartment apartment) {
        int roomNumber;

        System.out.print("Enter room number: ");
        roomNumber = EasyScanner.nextInt();

        double room = apartment.getRoomParameter(roomNumber);

        if (room != -999) {
            System.out.println("Perimeter = " + room);
        } else {
            System.out.println("Room do not exist");
        }
    }
}
