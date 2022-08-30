package main.java.ngntuli.chapter13;

import java.util.function.Supplier;

public class GenericInterfaceTesterVersion01 {
    public static void main(String[] args) {
        Supplier<String> string = () -> "42";
        System.out.println(string.get());

        Supplier<Integer> integer = () -> 21 + 21;
        System.out.println(integer.get());

        Supplier<Customer> customer = () -> {
            Customer customer1 = new Customer("Nkosinathi", "X4822", 5_000);
            customer1.setCreditLimit(100_000);
            return customer1;
        };


        System.out.println(customer.get().getName());
        System.out.println(customer.get().getId());
        System.out.println(customer.get().getCreditLimit());
    }
}
