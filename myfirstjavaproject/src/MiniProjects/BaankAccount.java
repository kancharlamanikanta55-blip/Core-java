package MiniProjects;

public class BaankAccount {
private String accHolderName;
private double balance;

	public String getAccHolderName() {
	return accHolderName;
}



public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}



public double getBalance() {
	return balance;
}



public void setBalance(double balance) {
	this.balance = balance;
}



	public static void main(String[] args) {
		BaankAccount b1 = new BaankAccount();
		b1.setAccHolderName("Udaya Chandra");
		b1.setBalance(20000);
		
		System.out.println(b1.getAccHolderName());
		System.out.println(b1.getBalance());
	}

}
