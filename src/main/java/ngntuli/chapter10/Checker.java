package main.java.ngntuli.chapter10;

public class Checker {
    public static void main(String[] args) {
        CheckableCustomer customer1 = new CheckableCustomer(
                "Givenson",
                "X523",
                10_000.0
        ); //valid
        CheckableCustomer customer2 = new CheckableCustomer(
                "Charlotte",
                "170116",
                5_000.0
        );//invalid
        CheckableCustomer customer3 = new CheckableCustomer(
                "Nkosi",
                "X43x",
                6_400.0
        );

        System.out.println("account1 is " + checkValidity(customer1));
        System.out.println("account2 is " + checkValidity(customer2));
        System.out.println("account3 is " + checkValidity(customer3));

    }

    private static String checkValidity(Checkable customer) {
        if (customer.check()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
