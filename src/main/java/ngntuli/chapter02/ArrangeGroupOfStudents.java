package main.java.ngntuli.chapter02;

import java.util.Scanner;

public class ArrangeGroupOfStudents {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int students;
        int team;

        System.out.println("*** Arranging Students in Teams ***");
        System.out.print("Enter number of students: ");
        students = keyboard.nextInt();
        System.out.print("Enter size of a team: ");
        team = keyboard.nextInt();
        System.out.println((students / team) + " teams can be formed");
        System.out.println((students % team) + " students that are left out without a team");
    }
}
