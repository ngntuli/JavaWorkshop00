package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double length;
        double height;
        double area;
        double perimeter;

        System.out.println("*** Calculate Area and Perimeter");
        System.out.print("Enter length: ");
        length = keyboard.nextDouble();
        System.out.print("Enter height: ");
        height = keyboard.nextDouble();
        area = length * height;
        perimeter = (2 * length) + (2 * height);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
