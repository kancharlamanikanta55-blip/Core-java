package myfirstjavaproject;

public class Banking {
	
	
	// static Banking t = new Banking();
	static String bankName = "Cenera Bank";
	
	 static Banking t = new Banking();

	
	long accountNumber = 623105056;
	int balance = 5000;
	
	 void deposit() {
		 balance = balance + 4999;
		 
		 System.out.println("Bank balance deposite " + balance);
		 
	 }
	 
	 void withdraw() {
		 balance = balance - 50000;
		 System.out.println("Money is withdraw for your account " + balance);
		 
	 }
	  
	 void checkBalance() {
		
		 System.out.println("CheckBalance");
	 }
	 
	 

	public static void main(String[] args) {
		// Banking t = new Banking();
		
		System.out.println("BankBalance " + t.balance);
		t.deposit();
		t.withdraw();
		t.checkBalance();
	}

}
