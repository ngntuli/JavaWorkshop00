package main.java.ngntuli.chapter05;

public class MethodsQ2 {

	public static void main(String[] args) {
		method1();
		System.out.println("England");
		method2();
		System.out.println("Ireland");
	}

	static void method1() {
		System.out.println("Wales");
	}

	static void method2() {
		System.out.println("Scotland");
		method1();
	}

}
