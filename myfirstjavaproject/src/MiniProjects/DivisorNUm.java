package MiniProjects;

import java.util.Scanner;

public class DivisorNUm {

	public static void main(String[] args) {
		System.out.println("Main method start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");

		int n = sc.nextInt();
		
		isdivisornum(n);
	}

	static void isdivisornum(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println(n);
	}

}
