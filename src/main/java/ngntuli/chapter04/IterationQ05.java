package main.java.ngntuli.chapter04;

public class IterationQ05 {

	public static void main(String[] args) {
		for (int i = 5; i > 2; i--) {
			switch (i) {
			case 1:
			case 3:
				System.out.println("YES");
				break;
			case 2:
			case 4:
			case 5:
				System.out.println("NO");
				break;
			}
		}
		System.out.println("OK");
	}

}
