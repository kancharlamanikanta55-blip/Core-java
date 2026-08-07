package myfirstjavaproject;

public class Movie {
	
	static String theatreName;
	
	String movieName;
	int movieId;
	String seatNumber;
	String booked;
	String status;

	void bookTicket() {
		System.out.println("For " + movieName + " Movie Ticket ");
	}

	void cancelTicket() {
		System.out.println("Booking has been " + status);
	}

	void displayTicketDetails() {
		System.out.println("The movie name  is : " + movieName);
		System.out.println("Movie ID : " + movieId);
		System.out.println("The seat number : " + seatNumber);
		System.out.println("Theatre Name : " + theatreName);
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		 
		m1.movieName = "ASVR";
		m1.movieId = 10100;
		m1.seatNumber = "A4";
		theatreName = "Bramaramba";
		m1.status = "cancelled";
		m1.displayTicketDetails();
		m1.cancelTicket(); 

		m1.bookTicket();
		m1.cancelTicket();
		System.out.println("*************************************");
		
		
		Movie m2 = new Movie();
		m2.movieName = "SpiderMan";
		m2.status = "confirm";
		m2.movieId = 10118;
		m2.seatNumber = "A2";
		theatreName = "Bramaramba";
		m2.displayTicketDetails();

		m2.bookTicket();
		m2.cancelTicket();

	}

}
