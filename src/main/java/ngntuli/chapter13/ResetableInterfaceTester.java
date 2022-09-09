package main.java.ngntuli.chapter13;

import main.java.ngntuli.chapter07.Oblong;

public class ResetableInterfaceTester {
    public static void main(String[] args) {
        Oblong oblong = new Oblong(5.5, 4.5);

        resetObject(() -> {
            oblong.setLength(1);
            oblong.setHeight(1);
        });

        System.out.println("Length " + oblong.getLength());
        System.out.println("Height " + oblong.getHeight());
    }

    private static void resetObject(ResetableInterface resetableObject) {
        resetableObject.reset();
    }
}
