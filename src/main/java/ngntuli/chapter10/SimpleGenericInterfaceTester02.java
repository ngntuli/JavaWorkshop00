package main.java.ngntuli.chapter10;

import java.util.function.Function;

public class SimpleGenericInterfaceTester02 {
    public static void main(String[] args) {
        Function<Integer, String> stringFunction = integer -> "You entered " + integer;
        System.out.println(stringFunction.apply(10));
    }
}
