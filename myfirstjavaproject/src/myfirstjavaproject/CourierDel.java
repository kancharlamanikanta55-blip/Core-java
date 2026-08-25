package myfirstjavaproject;

public class CourierDel {
	String customerName;
	int customerId;
	String source;
	String distination;
	int weight;
	double deliveryAmount;
	static int totalCouriers;
	static int totalWeight;
	static double totalAmountCollected;
	static int pricePerKg;

	static {
		System.out.println("Welcome to Quickship Courier!");
	}

	void bookCourier() {
		totalCouriers += totalCouriers;

		totalWeight = totalCouriers * pricePerKg;

		totalAmountCollected = totalWeight * pricePerKg;

	}

	void displayCourierDetail() {
		
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer ID: " + customerId);
		System.out.println("Source Of Product: " + source);
		System.out.println("Destination Of Product: " + distination);
		System.out.print("                    ");
		System.out.println("****  Courier Details  ****");
		System.out.println("PricePer KG: " + pricePerKg);
		System.out.println("Total Cauriers: " + totalCouriers);

	}

	static void displayTodayCollection() {

		System.out.println("Total Weight: " + totalWeight);

		System.out.println("TotalAmountCollected: " + totalAmountCollected);

		System.out.println("Successfully Booked.");

	}

	public static void main(String[] args) {
		CourierDel d = new CourierDel();

		System.out.print("            ");

		System.out.println("************ Customer-1 ***************** ");
		d.customerName = "Sai";
		d.customerId = 12568;
		d.source = "HYD";
		d.distination = "OGL";
		d.totalCouriers = 1;
		d.pricePerKg = 100;
		d.bookCourier();
		d.displayCourierDetail();

		displayTodayCollection();


		System.out.print("            ");

		System.out.println("************ Customer-2 ***************** ");

		CourierDel d1 = new CourierDel();

		d1.customerName = "Manoj";
		d1.customerId = 120048;
		d1.source = "PDLR";
		d1.distination = "GDR";
		d1.totalCouriers = 5;
		d1.pricePerKg = 100;
		d1.bookCourier();
		d1.displayCourierDetail();

		displayTodayCollection();
	}

}
