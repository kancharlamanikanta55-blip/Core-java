package myfirstjavaproject;

import java.util.Scanner;

public class MethodsDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("main method started!");
		System.out.println("Enter student Id:");
		int sid = sc.nextInt();
		System.out.println("Enter student name:");
		String sname = sc.next();
		System.out.println("Enter student age:");
		int age = sc.nextInt();

		System.out.println("Enter student Id:");
		int mid = sc.nextInt();
		System.out.println("Enter student name:");
		String mname = sc.next();
		System.out.println("Enter student age:");
		int age1 = sc.nextInt();

		getstudentdetails(sid, sname, age);
		getsecoundstudentdetails(mid, mname, age1);
		System.out.println("main method ended!");
	}

	static void getstudentdetails(int id, String name, int age) {

		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);

	}

	static void getsecoundstudentdetails(int id, String name, int age) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);

	}

}
