package main.java.ngntuli.chapter14;

import main.java.ngntuli.chapter07.EasyScanner;

public class ExceptionsQ2 {
    public static void main(String[] args) {
        int[] someArray = {12, 9, 3, 11};
        try {
            int position = getPosition();
            display(someArray, position);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End of program");
        }
    }

    private static void display(int[] someArray, int position) {
        System.out.println("Item at this position is : " + someArray[position]);
    }

    private static int getPosition() {
        System.out.println("Enter array position to display");
        String positionEntered = EasyScanner.nextString();
        return Integer.parseInt(positionEntered);
    }
}
