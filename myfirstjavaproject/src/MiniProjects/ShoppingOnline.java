package MiniProjects;

public class ShoppingOnline {

	    public static void main(String[] args) {
	        String[] products = {"BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES"};
	        int[] quantity = {2, 1, 5, 3, 2};
	        double[] price = {60.5, 150.0, 25.0, 40.0, 85.0};

	        double totalBill = 0;
	        double sumPrice = 0;
	       
	        double highestAmount = -1;
	        double lowestAmount = -1;
	        String highestProduct = "";
	        String lowestProduct = "";

	        for (int i = 0; i < products.length; i++) {
	            double total = quantity[i] * price[i];
	            totalBill = totalBill + total;
	            sumPrice = sumPrice + price[i];

	            // Highest
	            if (i == 0 || total > highestAmount) {
	                highestAmount = total;
	                highestProduct = products[i];
	            }
	            // Lowest
	            if (i == 0 || total < lowestAmount) {
	                lowestAmount = total;
	                lowestProduct = products[i];
	            }

	            System.out.println(products[i] + " : " + quantity[i] + " x " + price[i] + " = " + total);
	        }

	        double avgPrice = sumPrice / products.length;

	        System.out.println("---------------------------------");
	        System.out.println("Total Bill Amount for all products: " + totalBill);
	        System.out.println("Average Item Price: " + avgPrice);
	        System.out.println("Highest Purchase: " + highestProduct + " = " + highestAmount);
	        System.out.println("Lowest Purchase: " + lowestProduct + " = " + lowestAmount);
	    }
	}


