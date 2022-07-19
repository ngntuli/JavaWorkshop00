package main.java.ngntuli.chapter08;

public class Incubator {
    public static final int MAX = 10;
    public static final int MIN = -10;
    private int temperature;

    public Incubator() {
        temperature = 5;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemp() {
        temperature++;
    }

    public void decreaseTemp() {
        temperature--;
    }

}
