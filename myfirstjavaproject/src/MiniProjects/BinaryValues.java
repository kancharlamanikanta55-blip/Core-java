package MiniProjects;

import java.util.Scanner;

public class BinaryValues {

	public static void main(String[] args) {
		System.out.println("Main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String sum = "";
		while (n > 0) {
			int r = n % 2;
			n = n / 2;
			sum += r;
		}
		System.out.println("The binary num: " + sum);
	}

}
