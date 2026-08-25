package myfirstjavaproject;

import java.util.Scanner;

public class TestDemo4 {
	double balance = 5000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestDemo4 t = new TestDemo4();
		//double balance = 5000;

		System.out.println("Mani method started");
		System.out.println("Account balance ");
		double amount = sc.nextDouble();
		System.out.println("Enter amount Withdra");
		double wAmount = sc.nextDouble();
		t.deposite(amount);
		 t.withdraAmount(wAmount);
		t.checkBalance();
       
	}
	
	void withdraAmount(double wAmount) {
		if(wAmount <= balance) {
			wAmount = balance - wAmount;
			checkBalance();
		} else {
			System.out.println("Insufficient Balance");
			checkBalance();
		}
	}
	void checkBalance() {
		System.out.println("The current Balance: " + balance);
	}
	
	void deposite(double amount) {
		if (amount < 0) {
			balance = balance + amount;
			checkBalance();
		} else {
			System.out.println("Invalid balance!");
			checkBalance();
		}

	}
}
