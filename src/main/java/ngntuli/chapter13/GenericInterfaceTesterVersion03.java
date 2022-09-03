package main.java.ngntuli.chapter13;

import java.util.function.BiFunction;
import java.util.function.Function;

public class GenericInterfaceTesterVersion03 {
    public static void main(String[] args) {
        Function<Integer, String> function = integer -> "You entered " + integer;
        BiFunction<Integer, Integer, String> biFunction = (integer, integer2) -> "You entered " + (integer + integer);
        System.out.println(function.apply(42));
        System.out.println(biFunction.apply(21, 21));

    }
}
