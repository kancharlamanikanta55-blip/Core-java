package MiniProjects;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();

		isevenNum(n);
	}

	static void isevenNum(int n) {
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {

				System.out.println("Is even ");
			} else {
				System.out.println("is odd");
			}
		}
	}
}
