package main.java.ngntuli.chapter13;

public class ComputableGenericInterfaceTester {
    public static void main(String[] args) {
        ComputableGenericInterface<Double> add = (Double::sum);
        ComputableGenericInterface<Double> subtract = ((first, second) -> {
            return first - second;
        });
        ComputableGenericInterface<Double> multiple = ((first, second) -> {
            return first * second;
        });
        ComputableGenericInterface<Double> divide = ((first, second) -> {
            return first / second;
        });
        ComputableGenericInterface<Double> modular = ((first, second) -> {
            return first % second;
        });
        printResults(add);
        printResults(subtract);
        printResults(multiple);
        printResults(divide);
        printResults(modular);
    }

    private static void printResults(ComputableGenericInterface<Double> computableObject) {
        System.out.println(computableObject.compute(40.0, 2.0));
    }
}
