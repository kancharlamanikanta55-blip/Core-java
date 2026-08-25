package myfirstjavaproject;

public class LoanManagement {
	
	String customerName;
	double loanAmount;
	double interestRate;
	int loantenure;
	
	
	double calculateInterest(double loanAmount, double interestRate) {
		double interestRate1 = (loanAmount * interestRate * loantenure) / 100;
		return interestRate1;
	}
	
	double calculateTotalAmount( double interestRate1) {
		double totalAmount = loanAmount + interestRate1;
		return totalAmount; 
	}
	
	double calculateMontlyEMI(double totalAmount, double loantenure) {
		double montlyEmi = totalAmount / (loantenure * 	12) ;
		return montlyEmi;
	}
	
	void displayLoanSummary(double totalAmount, double interest, double montlyEmi) {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("InterestRate: " + interestRate);
		System.out.println("Loan Tenure: " + loantenure);
		
		System.out.println("Total Interest: " + interest);
		System.out.println("Total Amount: " + totalAmount);
		System.out.println("MontlyEmi: " + montlyEmi);
		
	}
	public static void main(String[] args) {
		LoanManagement lm = new LoanManagement();
		
		lm.customerName = "Uday";
		lm.loanAmount = 10000;
		lm.interestRate = 13;
		lm.loantenure = 2;
		
		double i = lm.calculateInterest( lm.loanAmount, lm.interestRate);
        double t = lm.calculateTotalAmount(i);
        double m = lm.calculateMontlyEMI(t,lm.loantenure);
        
        lm.displayLoanSummary(i, t, m);
	}

}
