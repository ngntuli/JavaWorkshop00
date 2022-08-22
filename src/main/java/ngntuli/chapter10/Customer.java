package main.java.ngntuli.chapter10;

public class Customer {
    private final String name;
    private final String id;
    private double creditLimit;

    public Customer(String name, String id, double creditLimit) {
        this.name = name;
        this.id = id;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
