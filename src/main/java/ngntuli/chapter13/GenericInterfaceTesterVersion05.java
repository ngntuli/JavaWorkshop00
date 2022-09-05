package main.java.ngntuli.chapter13;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class GenericInterfaceTesterVersion05 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer > 18;
        BiPredicate<Integer, Integer> biPredicate = (integer, integer2) -> integer >= integer2;
        System.out.println(predicate.test(21));
        System.out.println(biPredicate.test(21, 42));
        System.out.println(biPredicate.test(21, 21));
    }
}
