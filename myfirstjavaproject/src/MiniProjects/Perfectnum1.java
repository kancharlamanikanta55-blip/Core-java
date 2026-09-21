package MiniProjects;

import java.util.Scanner;

public class Perfectnum1 {

	static boolean isperfect(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum == n;

	}

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int n = sc.nextInt();
		boolean status = isperfect(n);

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (isperfect(i)) {
				count++;
				if (count == n) {
					System.out.println(i);
				}
				break;
			}
		}
	}
}
