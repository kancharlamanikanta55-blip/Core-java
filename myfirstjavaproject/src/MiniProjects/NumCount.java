package MiniProjects;

import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		//int temp = n;
		
		for (; n > 0; n = n / 10) {
			int r = n % 10;
			sum = sum+ 1;
			
				count++;
			}
		
		//System.out.println(temp);
		System.out.println(count);

	}

}
