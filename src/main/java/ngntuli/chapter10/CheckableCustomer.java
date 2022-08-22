package main.java.ngntuli.chapter10;

public class CheckableCustomer extends Customer implements Checkable {
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
