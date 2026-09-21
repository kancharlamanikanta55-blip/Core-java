package MiniProjects;

import java.util.Scanner;

public class ElectricityBill {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Connection type");
		String Connection = sc.next();
		
		System.out.println("Enter Units");
		int units = sc.nextInt();
		double totalbill = 0;
		
		switch(Connection) {
		case"domestic" -> {
			
			System.out.println("Domistic conenection type");
			
			
			if(units <= 100) {
				totalbill = units*2;
				System.out.println("The rate of per unit: 2 rs");
			} else if(units <= 300) {
				totalbill = units * 3;
				System.out.println("The rate of per unit: 3 rs");
			} else {
				System.out.println("Invalid");
			}
			System.out.println("Total units are used: " + units);
			System.out.println("Total Bill: " + totalbill);
		}
		
		case"commercal" -> {
			
			System.out.println("commercal conenection type");
			System.out.println("Enter Units");
			
			
			if(units < 100) {
				totalbill = units*4;
				System.out.println("The rate of per unit: 4 rs");
			} else if(units < 100 || units > 300 ) {
				totalbill = units * 6;
				System.out.println("The rate of per unit: 6 rs");
			} else if (units >= 300){
				System.out.println("The rate of per unit: 8 rs");
			} else {
				System.out.println("Default units");
				}
		}
			
		}
		
		System.out.println("Total units are used: " + units);
		System.out.println("Total Bill: " + totalbill);
	}
	}
