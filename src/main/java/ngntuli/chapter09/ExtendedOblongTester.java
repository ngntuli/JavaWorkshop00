package main.java.ngntuli.chapter09;

import main.java.ngntuli.chapter07.EasyScanner;

public class ExtendedOblongTester {
    public static void main(String[] args) {
        char symbol;
        System.out.print("Enter a symbol: ");
        symbol = EasyScanner.nextChar();

        ExtendedOblong extOblong = new ExtendedOblong(10.2, 5.3, symbol);

        System.out.println(extOblong.draw());
        extOblong.setSymbol('+');
        System.out.println(extOblong.draw());
    }
}
