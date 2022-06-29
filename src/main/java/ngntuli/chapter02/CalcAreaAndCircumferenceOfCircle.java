package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcAreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double PI = 3.1416;
        double radius;
        double area;
        double circumference;

        System.out.println("*** Calculate Area and Circumference of a circle ***");
        System.out.print("Enter value for the radius of a circle: ");
        radius = keyboard.nextDouble();
        area = PI * (radius * radius);
        circumference = 2 * PI * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}
