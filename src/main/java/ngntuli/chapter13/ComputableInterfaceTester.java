package main.java.ngntuli.chapter13;

public class ComputableInterfaceTester {
    public static void main(String[] args) {
        ComputableInterface add = (Double::sum);
        ComputableInterface subtract = ((first, second) -> {
            return first - second;
        });
        ComputableInterface multiple = ((first, second) -> {
            return first * second;
        });
        ComputableInterface divide = ((first, second) -> {
            return first / second;
        });
        ComputableInterface modular = ((first, second) -> {
            return first % second;
        });
        printResults(add);
        printResults(subtract);
        printResults(multiple);
        printResults(divide);
        printResults(modular);
    }

    private static void printResults(ComputableInterface computableObject) {
        System.out.println(computableObject.compute(40, 2));
    }
}
