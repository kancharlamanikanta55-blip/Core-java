package myfirstjavaproject;

public class ShoppingCart {
	
	int items;
	double totalAmount;
	String orderplaced;
	int price;
	static String website;
	
	void additem() {
		
		System.out.println("Number Of Items: " + items);
		
	}
	
	void placeOrder() {
		
		System.out.println("Order Status: " + orderplaced);
		
	}
	
	void displayCart() {
		
		System.out.println("Number Of Items: " + items);
		//System.out.println("Order Stetus: " + orderplaced);
		System.out.println( "TotalAmount: " + items * price);
		
		
	}
	
	static void changeWebsite() {
		System.out.println("WebsiteName: " + website);
	}
	
	static void displayWebsite() {
		System.out.println("WebsiteName: " + website);
	
		
	}

	public static void main(String[] args) {
		
		website = "Pizzahut";
		
		ShoppingCart sh1 = new ShoppingCart();
		 
		displayWebsite();
		sh1.items = 3;
		sh1.orderplaced = "placed";
		sh1.price = 100;
		sh1.additem();
		sh1.placeOrder();
		sh1.displayCart();
		
		System.out.println("**********************************************");
		
         website = "Biryani";
		
		ShoppingCart sh2 = new ShoppingCart();
		 
		displayWebsite();
		sh2.items = 5;
		sh2.orderplaced = "Not Placed";
		sh2.price = 120;
		sh2.additem();
		sh2.placeOrder();
		sh2.displayCart();
		
	}
		
	}


