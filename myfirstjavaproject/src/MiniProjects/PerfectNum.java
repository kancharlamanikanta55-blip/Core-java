package MiniProjects;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		System.out.println("Main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A num");
		int n = sc.nextInt();
		boolean status = isperfectnum(n);
		if (status) {
			System.out.println("is perfect");
		} else {
			System.out.println("not perfect");
		}
	}

	static boolean isperfectnum(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			status = true;
		}
		return status;
	}

}
