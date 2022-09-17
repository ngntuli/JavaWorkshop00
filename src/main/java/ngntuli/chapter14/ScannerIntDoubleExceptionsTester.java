package main.java.ngntuli.chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerIntDoubleExceptionsTester {
    public static void main(String[] args) {
        int numberInt;
        double numberDouble;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Start program");

            System.out.print("Enter integer: ");
            numberInt = scanner.nextInt();

            System.out.print("Enter real number: ");
            numberDouble = scanner.nextDouble();

            System.out.println();
            System.out.println("Integer : " + numberInt);
            System.out.println("Double : " + numberDouble);
        } catch (InputMismatchException e) {
            System.out.println("Wrong input format");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End program");
    }
}
