package main.java.ngntuli.chapter09;

import main.java.ngntuli.chapter07.EasyScanner;

import java.util.ArrayList;

public class VehicleTester {
    public static void main(String[] args) {
        char reply;
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("1. Add vehicle");
            System.out.println("2. Display a list of vehicles details");
            System.out.println("3. Delete vehicle");
            System.out.println("4. Quit");
            System.out.println();
            reply = EasyScanner.nextChar();
            switch (reply) {
                case '1':
                    option1(vehicles);
                    break;
                case '2':
                    option2(vehicles);
                    break;
                case '3':
                    option3(vehicles);
                    break;
                case '4':
                    break;
                default:
                    System.out.println("Choices [1-4] only");
            }
        } while (reply != '4');
    }

    private static void option3(ArrayList<Vehicle> vehicles) {
        boolean found = false;
        System.out.print("Enter RegNo: ");
        String regNo = EasyScanner.nextString();
        for (Vehicle car : vehicles) {
            if (car.getRegNo().equals(regNo)) {
                found = true;
                vehicles.remove(car);
                break;
            }
        }
        if (found) {
            System.out.println("Deleted");
        } else {
            System.out.println("Car not found");
        }
    }

    private static void option2(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No car available");
        }
        for (Vehicle car : vehicles) {
            System.out.println("##############################");
            System.out.println("RegNo:\t" + car.getRegNo());
            System.out.println("Made:\t" + car.getMake());
            System.out.println("Year:\t" + car.getYearManufacture());
            System.out.println("Price:\t" + car.getValue());
            System.out.println("Age:\t" + car.calculateAge(2022));
            System.out.println();
        }
    }

    private static void option1(ArrayList<Vehicle> vehicles) {
        System.out.print("Enter RegNo: ");
        String regNo = EasyScanner.nextString();

        for (Vehicle car : vehicles) {
            if (car.getRegNo().equals(regNo)) {
                System.out.println("Car already exist");
                return;
            }
        }
        System.out.print("Enter make: ");
        String make = EasyScanner.nextString();

        System.out.print("Enter Year Manufacture: ");
        int yearManufacture = EasyScanner.nextInt();

        System.out.print("Enter Price: ");
        double value = EasyScanner.nextDouble();

        vehicles.add(new Vehicle(regNo, make, yearManufacture, value));
        System.out.println("Added");
    }
}
