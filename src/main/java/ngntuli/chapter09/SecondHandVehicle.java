package main.java.ngntuli.chapter09;

public class SecondHandVehicle extends Vehicle {
    private final int numberOfOwners;

    public SecondHandVehicle(String regNo, String make, int yearManufacture, double value, int owner) {
        super(regNo, make, yearManufacture, value);
        numberOfOwners = owner;
    }

    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    public boolean hasMultipleOwners() {
        return numberOfOwners > 1;
    }
}
