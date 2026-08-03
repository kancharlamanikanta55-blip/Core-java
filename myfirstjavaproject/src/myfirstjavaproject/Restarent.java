package myfirstjavaproject;

public class Restarent {
	
	static String restarentName;
	
	int tableNumber;
	int seats;
	boolean reserved;
	String reservationStetus;
	
	void reserveTable() {
		System.out.println("Stetus: " + reserved);
		reserved=true;
	}
	
	void cancelReservation() {
		System.out.println("ReservationStetus: " + reservationStetus);
		reserved=false;
	}
	
    void displayTableDatails() {
    	System.out.println("TableNamber: " + tableNumber);
    	System.out.println("NumberOfSeats: " + seats);
    	System.out.println("Stetus: " + reserved);
    }
    
    static void changeRestarentName() {
    	restarentName="sdfghjk";
    }
    
    static void displayRestaurantName() {
    	System.out.println("RestarentName: " + restarentName);
    }
    
    
	public static void main(String[] args) {
		
		Restarent R1 = new Restarent();
		
		
		R1.tableNumber = 5;
		R1.seats = 10;
		R1.reserved = true;
		R1.reservationStetus = "Cancle";
		R1.reserveTable();
		R1.cancelReservation();
		R1.displayTableDatails();
		changeRestarentName();
		displayRestaurantName();
		
		
     Restarent R2 = new Restarent();
		
		
		R2.tableNumber = 10;
		R2.seats = 5;
		R2.reserved = true;
		R2.reservationStetus = "Cancle";
		R2.reserveTable();
		R2.cancelReservation();
		R2.displayTableDatails();
		
		displayRestaurantName();
	}

}
