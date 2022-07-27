package main.java.ngntuli.chapter09;

public class Vehicle {
    private final String regNo;
    private final String make;
    private final int yearManufacture;
    private double value;

    public Vehicle(String regNo, String make, int yearManufacture, double value) {
        this.regNo = regNo;
        this.make = make;
        this.yearManufacture = yearManufacture;
        this.value = value;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int calculateAge(int currentYear) {
        return currentYear - yearManufacture;
    }
}
