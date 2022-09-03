package main.java.ngntuli.chapter13;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class GenericInterfaceTesterVersion04 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = integer -> integer * 2;
        BinaryOperator<Double> binaryOperator = Double::sum;
        System.out.println(unaryOperator.apply(21));
        System.out.println(binaryOperator.apply(21.0, 21.0));
    }
}
