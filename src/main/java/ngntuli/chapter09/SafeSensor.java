package main.java.ngntuli.chapter09;

import main.java.ngntuli.chapter08.Sensor;

public class SafeSensor extends Sensor {
    private final double max;

    public SafeSensor(double max) {
        this.max = max;
    }

    public SafeSensor(double pressure, double max) {
        super(pressure);
        this.max = max;
    }

    public double getMax() {
        return max;
    }

    @Override
    public boolean setPressure(double pressure) {
        if (pressure < 0 || pressure > max) {
            return false;
        } else {
            this.pressure = pressure;
            return true;
        }
    }
}
