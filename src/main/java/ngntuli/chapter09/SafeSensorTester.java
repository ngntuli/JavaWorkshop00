package main.java.ngntuli.chapter09;

public class SafeSensorTester {
    public static void main(String[] args) {
        SafeSensor sensor1 = new SafeSensor(18);
        SafeSensor sensor2 = new SafeSensor(-14, 18);

        for (int i = 0; i < 20; i++) {
            System.out.println();
            if (i > sensor1.getMax()) {
                System.out.println("Alarm alarm alarm");
                break;
            }
            if (sensor1.setPressure(i)) {
                System.out.println("Pressure is set successful");
            } else {
                System.out.println("Less than zero pressure");
            }

            if (sensor2.setPressure(i)) {
                System.out.println("Pressure is set successful");
            } else {
                System.out.println("Less than zero pressure");
            }
            System.out.println("##################################");
            System.out.println("Sensor1 " + sensor1.getPressure());
            System.out.println("Sensor2 " + sensor2.getPressure());
            System.out.println("##################################");
        }


    }
}
