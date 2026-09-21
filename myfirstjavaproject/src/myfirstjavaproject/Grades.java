package myfirstjavaproject;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		/*
		 * if(marks>100||marks<0) { System.out.println("Invalid marks"); } else
		 * if(marks>90) { System.out.println("Grade A"); } else if(marks>80) {
		 * System.out.println("Grade B"); } else if(marks>70) {
		 * System.out.println("Grade C"); } else if(marks>60) {
		 * System.out.println("Grade D"); } else if(marks>50) {
		 * System.out.println("Pass"); } else { System.out.println("Fail"); }
		 */
		String grade = (marks >= 90) ? "A"
				: (marks >= 80) ? "B" : (marks >= 70) ? "C" : (marks >= 60) ? "D" : (marks > 50) ? "pass" : "fail";
		System.out.println("Grade : " + grade);
	}
}
