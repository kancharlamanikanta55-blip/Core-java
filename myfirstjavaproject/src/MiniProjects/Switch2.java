package MiniProjects;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		System.out.println("Mani method Started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to MY-Store");
		int size = sc.nextInt();
		System.out.println("Enter your Size");

		switch (size) {
		case 32 -> System.out.println("XL - Small");
		case 34 -> System.out.println("X - Small");
		case 36 -> System.out.println("Small");
		case 38 -> System.out.println("Medium");
		case 40 -> System.out.println("Large");
		case 42 -> System.out.println("X - Large");
		case 44 -> System.out.println("XL - Large");
		case 46 -> System.out.println("XXL - Big");

		default -> System.out.println("Enter size is not available in Store! ...... Sorry");
		}
		System.out.println("Main method Ended!");
	}

}
