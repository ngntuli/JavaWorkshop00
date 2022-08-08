package main.java.ngntuli.chapter08;

public class Booking {
    private final String number;
    private final String name;

    public Booking(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
