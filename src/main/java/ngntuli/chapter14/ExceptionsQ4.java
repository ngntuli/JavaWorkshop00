package main.java.ngntuli.chapter14;

import main.java.ngntuli.chapter07.EasyScanner;

public class ExceptionsQ4 {
    public static void main(String[] args) {
        int[] someArray = {12, 9, 3, 11};
        try {
            int position = getPosition();
            display(someArray, position);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (InvalidPositionException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("End of program");
        }
    }

    private static void display(int[] someArray, int position) {
        if (position >= someArray.length) {
            throw new InvalidPositionException("Invalid position in our array");
        }
        System.out.println("Item at this position is : " + someArray[position]);
    }

    private static int getPosition() {
        System.out.println("Enter array position to display");
        String positionEntered = EasyScanner.nextString();
        return Integer.parseInt(positionEntered);
    }
}
