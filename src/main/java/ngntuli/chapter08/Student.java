package main.java.ngntuli.chapter08;

public class Student {
	private static double fee = 3000.0;
	private String studentNumber;
	private String studentName;
	private int markForEnglish = -999;
	private int markForMaths = -999;
	private int markForScience = -999;

	public Student(String studentNumberIn, String studentNameIn) {
		studentNumber = studentNumberIn;
		studentName = studentNameIn;
	}

	public static double getFee() {
		return fee;
	}

	public static void setFee(double feeIn) {
		fee = feeIn;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getMarkForEnglish() {
		return markForEnglish;
	}

	public int getMarkForMaths() {
		return markForMaths;
	}

	public int getMarkForScience() {
		return markForScience;
	}

	public void enterMarks(int markForEnglishIn, int markForMathsIn, int markForScienceIn) {
		markForEnglish = markForEnglishIn;
		markForMaths = markForMathsIn;
		markForScience = markForScienceIn;
	}

	public double calculateAverageMark() {
		int total = markForEnglish + markForMaths + markForScience;
		return total / 3.0;
	}
}
