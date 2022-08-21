package main.java.ngntuli.chapter10;

public class CheckableCustomer extends Customer implements Checkable {
    public CheckableCustomer(String name, String id, double creditLimit) {
        super(name, id, creditLimit);
    }

    @Override
    public boolean check() {
        return false;
    }
}
