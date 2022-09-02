package main.java.ngntuli.chapter13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class GenericInterfaceTesterVersion02 {
    public static String name;
    public static int id;

    public static String biName;
    public static int biId;

    public static void main(String[] args) {
        Customer customer = new Customer("Nkosinathi", "X483", 5_999);
        Customer customer2 = new Customer("Nkosinathi", "X483", 5_999);

        Consumer<String> stringConsumer = string -> name = "Hello World " + string;
        stringConsumer.accept("42");
        BiConsumer<String, Double> biConsumer = (string, doubleBi) -> biName = string + " " + doubleBi;
        biConsumer.accept("Hello World", 42.0);

        Consumer<Integer> integerConsumer = integer -> id = integer * 2;
        integerConsumer.accept(21);
        BiConsumer<Integer, Integer> integerBiConsumer = (integer, integer2) -> biId = integer + integer2;
        integerBiConsumer.accept(21, 21);

        Consumer<Customer> customerConsumer = customer1 -> customer1.setCreditLimit(25_000);
        customerConsumer.accept(customer);
        BiConsumer<Customer, Double> customerDoubleBiConsumer = Customer::setCreditLimit;
        customerDoubleBiConsumer.accept(customer2, 500_000.0);

        System.out.println(name);
        System.out.println(id);
        System.out.println(customer.getName() + "\n" + customer.getId() + "\n" + customer.getCreditLimit());
        System.out.println("#############################");
        System.out.println(biName);
        System.out.println(biId);
        System.out.println(customer2.getName() + "\n" + customer2.getId() + "\n" + customer2.getCreditLimit());
    }
}
