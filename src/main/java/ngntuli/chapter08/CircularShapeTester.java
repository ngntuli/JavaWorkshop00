package main.java.ngntuli.chapter08;

import main.java.ngntuli.chapter07.EasyScanner;

public class CircularShapeTester {

    public static void main(String[] args) {
        char reply;
        double radius;

        System.out.println("*** Circular Shape ***");
        System.out.print("Enter radius: ");
        radius = EasyScanner.nextDouble();
        CircularShape shape = new CircularShape(radius);
        do {
            System.out.println();
            System.out.println("[1] Set radius");
            System.out.println("[2] Display radius");
            System.out.println("[3] Display area");
            System.out.println("[4] Display circumference");
            System.out.println("[5] Display diameter");
            System.out.println("[6] Quit");
            System.out.println();
            reply = EasyScanner.nextChar();

            switch (reply) {
                case '1':
                    option1(shape);
                    break;
                case '2':
                    System.out.println("Radius " + shape.getRadius());
                    break;
                case '3':
                    System.out.println("Area " + shape.calculateArea());
                    break;
                case '4':
                    System.out.println("Circumference " + shape.calculateCircumference());
                    break;
                case '5':
                    System.out.println("Diameter " + shape.calculateDiameter());
                    break;
                case '6':
                    break;
                default:
                    System.out.println("Options [1-6]");
            }
        } while (reply != '6');
    }

    static void option1(CircularShape shape) {
        double radius;
        System.out.println("Enter radius: ");
        radius = EasyScanner.nextDouble();
        shape.setRadius(radius);
    }

}
