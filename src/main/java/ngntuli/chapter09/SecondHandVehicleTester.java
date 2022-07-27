package main.java.ngntuli.chapter09;

public class SecondHandVehicleTester {
    public static void main(String[] args) {
        SecondHandVehicle car = new SecondHandVehicle("NG1990", "BMW X6",
                2020, 980_000.99, 2);
        System.out.println("RegNo: " + car.getRegNo());
        System.out.println("Made: " + car.getMake());
        System.out.println("Year: " + car.getYearManufacture());
        System.out.println("Age: " + car.calculateAge(2022));
        if (car.calculateAge(2022) > 2) {
            car.setValue(500_650.59);
        }
        System.out.println("Price: R" + car.getValue());
        if (car.hasMultipleOwners()) {
            System.out.println("Owners: " + car.getNumberOfOwners());
        } else {
            System.out.println("There is only one owner of this car");
        }


    }
}
