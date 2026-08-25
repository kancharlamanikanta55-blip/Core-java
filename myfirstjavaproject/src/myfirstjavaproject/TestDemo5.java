package myfirstjavaproject;

import java.util.Scanner;

class TestDemo5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Main method start!");
		
		System.out.println("Enter values of square: ");
		float side = sc.nextFloat();
		float areside = getAreOFSquare(side);
		System.out.println("The area of square: " + areside);
		
		System.out.println("*************************");
		
		System.out.println("Enter the values of triangle: ");
		
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double aretri = getAreaOfTriangle(base, height);
		System.out.println("The area of Triangele: " + aretri);
		
		System.out.println("********************");
		
		System.out.println("Enter the values of rectangle: ");
		
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double areret = getAreaOfRectangle(length, width);
		System.out.println("The area of Rectangle: " + areret);
		
		System.out.println("******************");
		
		System.out.println("enter the values of Circle:");
		
		double area = sc.nextDouble();
		
		double areacir = getAreaOfCircle(area);
		System.out.println("The are of Circle: " + areacir);
		
		System.out.println("Main method ended");
		}

	static float getAreOFSquare(float side) {
		return side * side;
	}

	static double getAreaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}
	static double getAreaOfRectangle(double length, double width) {
		return length * width;
	}
	static double getAreaOfCircle(double area) {
		return Math.PI * area * area;
	}

}
