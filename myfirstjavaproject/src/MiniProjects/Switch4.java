package MiniProjects;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My Mart");
		String yn = "";
		double totalcost = 0;
		double totalprice = 0;
		double totalpriceveg = 0;
		do {
			System.out.println("Enter Category");
			String ctg = sc.next();

			switch (ctg) {

			case "fruits" -> {

				String syn = "";
				
				String item = sc.next();

				do {

					System.out.println("Enter items below");
					String items = sc.next();

					switch (items) {
					case "app" -> {
						System.out.println("Apple per kg 250 rs");
						double price = 250;
						totalprice = totalprice + price;
						item = "apple";
						System.out.println("Item Name: " + item);
					}
					case "banana" -> {
						System.out.println("Banana per dagin 120 rs");
						double price = 120;
						totalprice = totalprice + price;
						item = "Banana";
						System.out.println("Item Name: " + item);
					}
					case "grapes" -> {
						System.out.println("Grapes per kg 200 rs");
						double price = 200;
						totalprice = totalprice + price;
						item = "Grapes";
						System.out.println("Item Name: " + item);

					}
					case "gova" -> {
						System.out.println("Gova per kg 80 rs");
						double price = 80;
						totalprice = totalprice + price;
						item = "Gova";
						System.out.println("Item Name: " + item);

					}
					default -> System.out.println("Enter item is not Available in my Mart");
					}
					System.out.println("Do you want to continue Click y for yes N for no");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));
				System.out.println("Total Cost : " + totalprice);
				System.out.println("Item Name: " + item);
			}

			case "veg" -> {
				String syn = "";
				String item = sc.next();

				do {
					System.out.println("Enter items below");
					String items = sc.next();
					switch (items) {
					case "tomato" -> {
						System.out.println("Tomato per kg 250 rs");
						double price = 250;
						totalpriceveg = totalpriceveg + price;
						item = "Tomato";
						System.out.println("Item Name: " + item);
					}
					case "bringel" -> {
						System.out.println("Bringel per dagin 120 rs");
						double price = 120;
						totalpriceveg = totalpriceveg + price;
						item = "Bringel";
						System.out.println("Item Name: " + item);
					}
					case "Chilli" -> {
						System.out.println("Chilli per kg 200 rs");
						double price = 200;
						totalpriceveg = totalpriceveg + price;
						item = "Chilli";
						System.out.println("Item Name: " + item);

					}
					case "onion" -> {
						System.out.println("Onion per kg 80 rs");
						double price = 80;
						totalpriceveg = totalpriceveg + price;
						item = "Onion";
						System.out.println("Item Name: " + item);

					}
					default -> System.out.println("Enter item is not Available in my Mart");

					}
					System.out.println("Do you want to continue Click y for yes N for no");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));
				System.out.println("Total Cost : " + totalpriceveg);
				System.out.println("Item Name: " + item);

				totalcost =  totalpriceveg + totalprice;
			}
			default -> System.out.println("Enter catogery not availble");
			}
			System.out.println("Do you want to continu with Category.class..?  Click Y for yes N for no");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));
		System.out.println("Total Cost: " + totalcost);
	}
}