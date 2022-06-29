package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class SwapAttempt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x;
        int y;
        int tmp;

        System.out.print("Enter value for x ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y ");
        y = keyboard.nextInt();

        //swap two variables
        tmp = x;
        x = y;
        y = tmp;

        //display results
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
