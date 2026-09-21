package MiniProjects;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("Main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();

		boolean s = isprimenum(n);
		if (s) {
			System.out.println("prime");

		} else {
			System.out.println("Not a prime");
		}

	}

	private static boolean isprimenum(int n) {
		for (int i = 2; i < n - 2; i++) {
			if (n % i == 0) {

				return false;
			}

		}
		return true;
	}
}
