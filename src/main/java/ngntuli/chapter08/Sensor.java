package main.java.ngntuli.chapter08;

public class Sensor {
    private double pressure;

    public Sensor() {
    }

    public Sensor(double pressure) {
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }

    public boolean setPressure(double pressure) {
        if (pressure < 0) {
            return false;
        }
        this.pressure = pressure;
        return true;
    }
}
