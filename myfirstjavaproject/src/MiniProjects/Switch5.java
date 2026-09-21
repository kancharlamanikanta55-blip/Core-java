package MiniProjects;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		Scanner sc = new Scanner(System.in);
		String tyn = "";
		double totalBill = 0;

		double totalDBill = 0;
		double totaliBill = 0;
		double totalcost = 0;
		double totalprice = 0;
		double price = 0;
		do {

			System.out.println("Welcome to 5-Star");
			System.out.println("Enter Your Catergory....");
			String ctg = sc.next();

			switch (ctg) {

			case "nonveg" -> {
				String itemname = sc.next();
				String vyn = "";

				do {
					System.out.println("Enter your items...");
					String item = sc.next();

					switch (item) {

					case "chb" -> {
						System.out.println("Biryani price 250 rs...");
						itemname = "Chick-Biryani";
						System.out.println("Order Item Name: " + itemname);
						price = 250;
						totalcost = totalcost + price;
					}
					case "mtb" -> {
						System.out.println("Biryani price 450 rs...");
						itemname = "Mutton-Biryani";
						System.out.println("Order Item Name: " + itemname);
						price = 450;
						totalcost = totalcost + price;
					}
					case "fb" -> {
						System.out.println("Biryani price 350 rs...");
						itemname = "Fronce-Biryani";
						System.out.println("Order Item Name: " + itemname);
						price = 350;
						totalcost = totalcost + price;
					}
					case "lpb" -> {
						System.out.println("Biryani price 300 rs...");
						itemname = "Lolipop-Biryani";
						System.out.println("Order Item Name: " + itemname);
						price = 300;
						totalcost = totalcost + price;
					}
					case "apb" -> {
						System.out.println("Biryani price 400 rs...");
						itemname = "Appolo-Fishfry";
						System.out.println("Order Item Name: " + itemname);
						price = 400;
						totalcost = totalcost + price;
					}
					default -> System.out.println("Order item is not Available........!");
					}
					System.out.println("Do you want to continue Click Y for yes N for no");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("Total Bill: " + totalcost);
				System.out.println("Item Name: " + itemname);

			}
			case "veg" -> {
				String vegitemname = sc.next();
				String yn = "";
				do {
					System.out.println("Enter your items...");
					String item = sc.next();

					switch (item) {
					case "vgb" -> {
						System.out.println("Vegitable-Biryani price 200 rs");
						vegitemname = "Vegitable-Biryani";
						price = 200;
						totalprice = totalprice + price;
					}
					case "smr" -> {
						System.out.println("Sambar-Rice price 150 rs");
						vegitemname = "Sambar-Rice ";
						price = 150;
						totalprice = totalprice + price;
					}
					case "vgt" -> {
						System.out.println("Veg-Thalli price 300 rs");
						vegitemname = "Veg-Thalli ";
						price = 300;
						totalprice = totalprice + price;
					}
					case "cdr" -> {
						System.out.println("Curd-Rice price 100 rs");
						vegitemname = "Curd-Rice";
						price = 100;
						totalprice = totalprice + price;
					}
					case "bnm" -> {
						System.out.println("Boojanam price 250 rs");
						vegitemname = "Boojanam ";
						price = 250;
						totalprice = totalprice + price;
					}
					default -> System.out.println("Order item is not Available........!");
					}
					System.out.println("Do you want to Continu Click Y for yes N foe no");
					yn = sc.next();
				} while (yn.equalsIgnoreCase("y"));
				System.out.println("Total Bill: " + totalprice);
				System.out.println("Item Name: " + vegitemname);
			}
			case "drinks" -> {
				String dyn = "";
				String ditemname = sc.next();
				do {
					System.out.println("Enter your items...");
					String item = sc.next();
					switch (item) {
					case "cock" -> {
						System.out.println("Cock price 60 rs...");
						price = 60;
						ditemname = "Cock";
						totalDBill = totalDBill + price;
					}
					case "7UP" -> {
						System.out.println("7Up price 40 rs...");
						price = 40;
						ditemname = "7UP";
						totalDBill = totalDBill + price;
					}
					case "thp" -> {
						System.out.println("Thumps Up price 60 rs...");
						price = 80;
						ditemname = "Thumps Up";
						totalDBill = totalDBill + price;
					}
					default -> System.out.println("Order item is not Available........!");
					}

					System.out.println("Do you want to Continu Click Y for yes N foe no");
					dyn = sc.next();
				} while (dyn.equalsIgnoreCase("y"));
				System.out.println("Total Bill: " + totalDBill);
				System.out.println("Item Name: " + ditemname);
			}
			case "ice" -> {
				String iyn = "";
				String itemname = sc.next();

				do {
					System.out.println("Enter your items...");
					String item = sc.next();
					switch (item) {

					case "cht" -> {
						System.out.println("Chocolot- Ice Cream price 350..");
						itemname = "Chocolot- Ice Cream";
						price = 350;
						totaliBill = totaliBill + price;
					}
					case "str" -> {
						System.out.println("Straberry- Ice Cream price 310..");
						itemname = "Straberry- Ice Cream";
						price = 310;
						totaliBill = totaliBill + price;
					}
					case "vnl" -> {
						System.out.println("Vanilla- Ice Cream price 250..");
						itemname = "Vanilla- Ice Cream";
						price = 250;
						totaliBill = totaliBill + price;
					}
					default -> System.out.println("Order item is not Available........!");

					}
					System.out.println("Do you want to Continu Click Y for yes N foe no");
					iyn = sc.next();
				} while (iyn.equalsIgnoreCase("y"));
				System.out.println("Total Bill: " + totaliBill);
				System.out.println("Item Name: " + itemname);

				totalBill = totaliBill + totalDBill + totalcost + totalprice;

			}
			default -> System.out.println("Enter catogery not availble");
			}
			System.out.println("Do you wnat to continu Click y for ye no for no");
			tyn = sc.next();
		} while (tyn.equalsIgnoreCase("y"));
		System.out.println("Total Bill: " + totalBill);
	}

}
