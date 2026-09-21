package MiniProjects;

import java.util.Scanner;

public class StrongNum {

	static int FactNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int count = 0;

		for (; n > 0; n = n / 10) {
			int r = n % 10;
			sum = sum + FactNumber(r);

			count++;
		}
		System.out.println(count);

		if (sum == temp) {
			System.out.println(sum + " is a Strong Number.");
		} else {
			System.out.println(sum + " is NOT a Strong Number.");
		}
	}

}
