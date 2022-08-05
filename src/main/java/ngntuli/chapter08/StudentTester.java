package main.java.ngntuli.chapter08;

import main.java.ngntuli.chapter07.EasyScanner;

import java.util.ArrayList;

public class StudentTester {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int number;

        System.out.println("*** Students ***");
        System.out.println("School Fees is " + Student.getFee());
        System.out.print("Enter a number of students: ");
        number = EasyScanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println();
            System.out.println("Student[" + (i + 1) + "]");

            System.out.print("Enter student number: ");
            String studentNumber = EasyScanner.nextString();

            System.out.print("Enter student name: ");
            String studentName = EasyScanner.nextString();

            students.add(new Student(studentNumber, studentName));

            System.out.print("Enter marks for English: ");
            int marksForEnglish = EasyScanner.nextInt();

            System.out.print("Enter marks for Maths: ");
            int marksForMaths = EasyScanner.nextInt();

            System.out.print("Enter marks for Science: ");
            int marksForScience = EasyScanner.nextInt();

            students.get(i).enterMarks(marksForEnglish, marksForMaths, marksForScience);

        }

        Student.setFee(3600.80);

        for (Student student : students) {
            System.out.println();
            System.out.println("######################");
            System.out.println("School Fees is " + Student.getFee());
            System.out.println("Number " + student.getStudentNumber());
            System.out.println("Name " + student.getStudentName());
            System.out.println("English " + student.getMarkForEnglish());
            System.out.println("Maths " + student.getMarkForMaths());
            System.out.println("Science " + student.getMarkForScience());
            System.out.println("Average " + student.calculateAverageMark());
            System.out.println("######################");
        }
    }

}
