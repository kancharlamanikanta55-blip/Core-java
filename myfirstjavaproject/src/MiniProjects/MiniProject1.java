package MiniProjects;

import java.util.Scanner;

public class MiniProject1 {

	public static void main(String[] args) {
		System.out.println("Main method Starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();

		int scnum = sc.nextInt(10) + 1;
		System.out.println("Guss the number between 1 - 10 !");

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);

			int userGuess = sc.nextInt();
			if (userGuess == scnum) {
				System.out.println("You win");
				return;
			} else {
				System.out.println("Wrong guess");
			}

			if (i == 3) {
				System.out.println("Better luck next time");
				System.out.println("Correct num: " + scnum);
			}
		}

	}

}
