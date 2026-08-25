package myfirstjavaproject;

// import java.util.Scanner;

public class ZoomCarRental {
	
	
	double getrentdaily() {
		return 1500;
	}
	
	double getinsurence() {
		return 500;
	}
	int getdays(int days) {
		return days;
	}
	double totalAmount(double rentDaily, double insurence, int days) {
		double total = days * rentDaily + insurence;
		return total;
		
	}
	
	String getmessage(String message) {
		System.out.println("Welcome To ZoomCar Rentals.");
		return message;
	}
	

	public static void main(String[] args) {
		ZoomCarRental z = new ZoomCarRental();
	
		
		double r = z.getrentdaily();
		double i = z.getinsurence();
		int d = z.getdays(5);
		String m = z.getmessage(null);
		double t = z.totalAmount(r, i, d);
		
		System.out.println("Total Amount: " + t);
	 }

}
