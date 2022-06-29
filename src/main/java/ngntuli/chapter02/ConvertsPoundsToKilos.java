package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class ConvertsPoundsToKilos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double pounds;
        double kilosToPounds = 2.2;

        System.out.println("*** Converts Pounds to Kilos ***");
        System.out.print("Enter value in pounds: ");
        pounds = keyboard.nextDouble();
        pounds = pounds / kilosToPounds;
        System.out.println(pounds + "kilos");
    }
}
