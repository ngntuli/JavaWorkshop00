package main.java.ngntuli.chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScannerPlus {
    public static int nextInt() {
        int anInt = -999;

        while (anInt == -999) {
            anInt = nextIntExcept(new Scanner(System.in));
        }
        return anInt;
    }

    private static int nextIntExcept(Scanner scanner) {
        int tmp = 0;
        try {
            tmp = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.print("IntegerError: wrong input format, re-enter: ");
            return -999;
        }
        return tmp;
    }

    public static double nextDouble() {
        double aDouble = -999;

        while (aDouble == -999) {
            aDouble = nextDoubleExcept(new Scanner(System.in));
        }
        return aDouble;
    }

    private static double nextDoubleExcept(Scanner scanner) {
        double tmp = 0;

        try {
            tmp = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.print("DoubleError: wrong input format, re-enter: ");
            return -999;
        }
        return tmp;
    }
}
