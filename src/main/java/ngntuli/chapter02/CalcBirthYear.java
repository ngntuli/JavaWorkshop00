package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class CalcBirthYear {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int YEAR = 2022;
        int age;
        int bornIn;
        System.out.print("How old are you this year? ");
        age = keyboard.nextInt();
        bornIn = YEAR - age;
        System.out.println("I think you were born in " + bornIn);
    }
}
