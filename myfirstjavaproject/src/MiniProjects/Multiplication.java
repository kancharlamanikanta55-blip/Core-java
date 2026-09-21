package MiniProjects;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num");
		int n1 = sc.nextInt();
		System.out.println("Enter sec num");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			multitable(i, n2);
		}

		
	}

	static void multitable(int n1, int n2) {
		for (int i = 1; i <= n2; i++) {

			System.out.println(n1 + " X " + i + " = " + (n1 * i));

		}
	}

}
