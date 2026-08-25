package myfirstjavaproject;

public class Shopping {
	static String storeName;
	String customerName;
	String productName;
	double price;
	double quantity;
	double finalAmount;
	double discount1;
	void addproduct(String pname, double pr, int qty) {
		productName = pname;
		price = pr;
		quantity = qty;
		System.out.println("Product added successfully!");

	}

	void calculateTotal(double discount) {
		price = price * quantity;
		discount1 =( price * discount )/ 100;
		finalAmount = price - discount;
		
	}

	void displayCart() {
		System.out.println("StoreName     : " + storeName);
		System.out.println("CustomerName  : " + customerName);
		System.out.println("Product Name  : " + productName);
		System.out.println("Total Price   : " + price);
		System.out.println("Total Quantity: " + quantity);
		System.out.println("Final Amount  : " + finalAmount);
		System.out.println("Total Discount: " + discount1);
		
	}

	public static void main(String[] args) {
		Shopping sh = new Shopping();

		storeName = "DMart";
		sh.customerName = "Ayay";
		sh.addproduct("Rice", 1500, 10);
		sh.calculateTotal(5);
		sh.displayCart();
		System.out.println("***********************************************");
		Shopping sh1 = new Shopping();

		storeName = "SMart";
		sh1.customerName = "Gowtham";
		sh1.addproduct("Non-veg", 500, 2);
		sh1.calculateTotal(10);
		sh1.displayCart();
	}

}
