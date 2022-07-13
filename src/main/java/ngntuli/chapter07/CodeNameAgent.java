package main.java.ngntuli.chapter07;

public class CodeNameAgent {

	public static void main(String[] args) {
		String codename;
		String confirm;
		System.out.println("*** Code name for an agent ***");
		System.out.print("Enter code name: ");
		codename = EasyScanner.nextString();

		while (codename.length() < 6 || !(codename.startsWith("Agent"))) {
			System.out.println("INVALID CODENAME");
			System.out.print("re enter code name: ");
			codename = EasyScanner.nextString();
			if (codename.charAt(codename.length() - 1) != 'X') {
				codename = "12345";
			}
		}
		System.out.println();
		System.out.print("Confirm your code name: ");
		confirm = EasyScanner.nextString();
		if (codename.equals(confirm)) {
			System.out.println("CODE NAME CONFIRMED");
		} else {
			System.out.println("CODE NAME MIS-MATCH");
		}
	}

}
