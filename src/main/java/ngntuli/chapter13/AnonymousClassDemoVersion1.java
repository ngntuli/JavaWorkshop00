package main.java.ngntuli.chapter13;

public class AnonymousClassDemoVersion1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nkosinathi", "X843", 4_999);//valid
        Customer customer2 = new Customer("Charlotte", "170116", 5_000.0);//invalid

        Checkable checkableCustomer1 = new Checkable() {
            @Override
            public boolean check() {
                String id = customer1.getId();
                if (id.length() != 4 || Character.isDigit(id.charAt(0))) {
                    return false;
                }
                for (int i = 1; i < 4; i++) {
                    if (Character.isLetter(id.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        };

        Checkable checkableCustomer2 = new Checkable() {
            @Override
            public boolean check() {
                String id = customer2.getId();
                if (id.length() != 4 || Character.isDigit(id.charAt(0))) {
                    return false;
                }
                for (int i = 1; i < 4; i++) {
                    if (Character.isLetter(id.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        };

        System.out.println("customer1 is " + checkValidity(checkableCustomer1));
        System.out.println("customer2 is " + checkValidity(checkableCustomer2));

    }

    private static String checkValidity(Checkable customer) {
        if (customer.check()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
