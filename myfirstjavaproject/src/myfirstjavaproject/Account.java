package myfirstjavaproject;

public class Account {
	
	
	static String IFSCCODE = "124K400";
	static String AccountHolderName = "Manikanta";
	static int AccountNumber = 43005521;
	
	
	int BankBalance = 500000;
	
   void show() {
		
		System.out.println("AccountHolderName : " + AccountHolderName);
		System.out.println("AccountNumber : " + AccountNumber);
		System.out.println("BankBalance : " + BankBalance);
		
		
		System.out.println("*********************************************");
		
		

		
	}
	
	
	

	public static void main(String[] args) {
		
		Account b = new Account();
		
		b.show();
		
		AccountHolderName = "sai";
		AccountNumber = 2445233;
		b.BankBalance = 3000;
		
		System.out.println("AccountHolderName : " + AccountHolderName);
		System.out.println("AccountNumber : " + AccountNumber);
		
		System.out.println("BankBalance : " + b.BankBalance);
		

	}

}
