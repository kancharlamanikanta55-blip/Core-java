package MiniProjects;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);

		String yn = "";
		do {
			
			System.out.println("Calculator");
			System.out.println("Enter Fcirst Element");
			int a1 = sc.nextInt();
			System.out.println("Enter Secound Element");
			int a2 = sc.nextInt();
			System.out.println("Eneter a symbol to calculate values");
			String sym = sc.next();
			double result = 0;
			
			switch (sym) {

			case "+" -> {
				System.out.println("Addition of two numbers");
				result = a1 + a2;
			}
			case "-" -> {
				System.out.println("Subtraction of two numbers");
				result = a1 - a2;

			}
			case "*" -> {
				System.out.println("Multipilication of two numbers");
				result = a1 * a2;

			}
			case "%" -> {
				System.out.println("Persentage of two numbers");
				result = a1 % a2;
			}
			case "/" -> {
				System.out.println("Division of two numbers");
				result = a1 / a2;
			}
			default -> System.out.println("NO values are entered");

			}
			System.out.println("TOtal result: " + result);
			System.out.println("Do You want to calculate...? Click Y for yes or N for No");
			yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
	}

}
