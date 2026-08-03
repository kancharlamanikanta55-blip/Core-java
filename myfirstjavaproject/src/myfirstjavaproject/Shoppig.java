package myfirstjavaproject;

public class Shoppig {

	
	static int cost = 7;
	static int amount = 100;
	
	static int totalcost = amount / cost;
	

	static int totalcost1 = amount % cost;
	

	public static void main(String[] args) {
		
	

		System.out.println("TotalCost: " + cost);
	    System.out.println("TotalAmount: " + amount);
	    System.out.println("NoOfPencils: " + totalcost);
	    System.out.println("RemaingAmount: " + totalcost1);
	    
		
	}

}
