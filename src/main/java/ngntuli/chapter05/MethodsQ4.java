package main.java.ngntuli.chapter05;

public class MethodsQ4 {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(myMethod(x, y));
		System.out.println(y);
	}

	static int myMethod(int firstIn, int secondIn) {
		int x = 10;
		int y;
		y = x + firstIn + secondIn;
		return y;
	}

}
