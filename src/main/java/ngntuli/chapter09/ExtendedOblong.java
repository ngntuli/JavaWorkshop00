package main.java.ngntuli.chapter09;

import main.java.ngntuli.chapter07.Oblong;

public class ExtendedOblong extends Oblong {
    private char symbol;

    public ExtendedOblong(double length, double height, char symbol) {
        super(length, height);
        this.symbol = symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String draw() {
        String s = "";
        int l;
        int h;

        l = (int) getLength();
        h = (int) getHeight();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                s = s + symbol;
            }
            s = s + '\n';
        }
        return s;
    }
}
