package MiniProjects;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		System.out.println("Main method Started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome !");
		System.out.println("Enter jersey number of player...*");
		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Dhoni");
			System.out.println("Cool Caption");
			break;
		case 45:
			System.out.println("Rohit");
			System.out.println("Hit Man");
			break;
		case 18:
			System.out.println("Virat Kohli");
			System.out.println("Consistance");
			break;

		default:
			System.out.println("Enter jersey number is not playing");
		}
		System.out.println("Main method ended");

	}

}
