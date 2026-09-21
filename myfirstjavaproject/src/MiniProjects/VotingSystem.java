package MiniProjects;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Candidate age...");
		int age = sc.nextInt();

		if (age < 18) {
			System.out.println("Candidate not Elgible");
		} else {
			System.out.println("Candidate Elgible");
		}

		System.out.println("Enter Gender detils");
		char gender = sc.next().toUpperCase().charAt(0);

		if (gender == 'M' || gender == 'F') {
			System.out.println(" Elgible.");
		} else {
			System.out.println("Not Elgible");
		}

		System.out.println("Enter voterID");
		int voterId = sc.nextInt();
		System.out.println("Vote for the candidate");
		int vote=sc.nextInt();

		switch (vote) {
		case 1 -> {
			System.out.println("1. Ajay Kumar");
		}
		case 2 -> {
			System.out.println("2. Gowtham");
		}
		case 3 -> {
			System.out.println("3. Uday");
		}
		case 4 -> {
			System.out.println("4. Manoj");
		}
		default -> System.out.println("Invalid voter Id");
		}

	}

}
