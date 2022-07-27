package main.java.ngntuli.chapter08;

public class SensorTester {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor(14);

        if (sensor1.setPressure(0)) {
            System.out.println("Pressure is set successful");
        } else {
            System.out.println("Less than zero pressure");
        }

        if (sensor2.setPressure(12)) {
            System.out.println("Pressure is set successful");
        } else {
            System.out.println("Less than zero pressure");
        }

        System.out.println("Sensor1 " + sensor1.getPressure());
        System.out.println("Sensor2 " + sensor2.getPressure());
    }
}
