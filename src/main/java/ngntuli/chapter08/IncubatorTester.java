package main.java.ngntuli.chapter08;

public class IncubatorTester {
    public static void main(String[] args) {
        Incubator incubator = new Incubator();
        System.out.println("*** Incubator ***");
        System.out.println();

        int temp = incubator.getTemperature();
        System.out.println("##################");
        while (temp <= Incubator.MAX) {
            temp = incubator.getTemperature();
            if (temp > Incubator.MAX) {
                System.out.println("Alarm it is too hot");
                System.out.println();
            } else {
                System.out.println(incubator.getTemperature() + " degree");
                incubator.increaseTemp();
            }
        }
        System.out.println("##################");
        while (temp >= Incubator.MIN) {
            temp = incubator.getTemperature();
            if (temp < Incubator.MIN) {
                System.out.println("Alarm it is too cold");
            } else {
                System.out.println(incubator.getTemperature() + " degree");
                incubator.decreaseTemp();
            }
        }
        System.out.println("##################");
    }
}
