package main.java.ngntuli.chapter13;

import java.util.function.Function;

public class SimpleGenericInterfaceTester01 {
    public static void main(String[] args) {
        Function<Integer, String> t = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "You entered " + integer;
            }
        };
        System.out.println(t.apply(10));
    }
}
