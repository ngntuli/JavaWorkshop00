package main.java.ngntuli.chapter13;

public class InnerClassDemo {
    public static void main(String[] args) {
        //inner class
        class CheckableCustomer extends Customer implements Checkable {

            public CheckableCustomer(String name, String id, double creditLimit) {
                super(name, id, creditLimit);
            }

            @Override
            public boolean check() {
                String id = getId();
                char firsLetter = id.charAt(0);
                if (id.length() < 4 || Character.isDigit(firsLetter)) {
                    return false;
                }

                for (int i = 1; i < id.length(); i++) {
                    char value = id.charAt(i);
                    if (Character.isLetter(value)) {
                        return false;
                    }
                }
                return true;
            }
        }
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
