package myfirstjavaproject;

public class VandeExpress {
	String passengerName;
	int age;
	String source;
	String destination;
	static int numOfTickets;
	static int totalTicketBought;
    static double totalAmount;
    static int price;
    static int overalltickets;
    static {
       System.out.println("Welcome to Vande Express  thank you for choosing us.");
    }
    
   void bookTicket() {
	   totalAmount  = price * numOfTickets;
	   totalTicketBought = totalTicketBought + numOfTickets;
	   System.out.println("Ticket Amount: " + totalAmount);
	   System.out.println("Your ticket booking successful.");
  }
   
   void displayBookingDetials() {
	   System.out.println("PassengerName: " + passengerName);
	   System.out.println("PassengerAge: " + age);
	   System.out.println("Source: " + source);
	   System.out.println("Destination: " + destination);
	   System.out.println("TicketPrice: " + price);
	  
	  
   }
   
   static void ticketCounter() {
	   System.out.println("NumOfTickets: " + numOfTickets);
	   System.out.println("TotalAmount: " + totalAmount);
	   System.out.println("OverAllTickets: " + totalTicketBought);
   }
   
	public static void main(String[] args) {
		
		VandeExpress s1 = new VandeExpress();
		
		s1.passengerName = "ajay";
		s1.age = 30;
		s1.source = "Ogl";
        s1.destination = "Hyd";
        s1.numOfTickets = 5;
        s1.price = 500;
        s1.displayBookingDetials();

        s1. bookTicket();
        s1.ticketCounter();
        
        
        System.out.println("****************************");
        
       VandeExpress s2 = new VandeExpress();
		
		s2.passengerName = "Manoj";
		s2.age = 25;
		s2.source = "Nlr";
        s2.destination = "Hyd";
        s2.numOfTickets = 10;
        s2.price = 500;
        s2. bookTicket();
        s2.displayBookingDetials();
        s2.ticketCounter();
	}

}
