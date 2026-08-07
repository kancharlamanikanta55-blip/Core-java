package myfirstjavaproject;

public class Company {

	String employeeName;
	double monthlySalary;
	double monthlyGst;
	double monthlyPf;
	double netMonthlySal;
	double annualGst;
	double annualPf;
	double annualNetSal;
	
	void calculateMonthlyPf() {
		
		monthlyPf = monthlySalary * 2/100;
		System.out.println("MonthlyPf: " + monthlySalary);
		
	}
	
	void calculateMonthlyGst() {
		
		monthlyGst = monthlySalary * 3/100;
		System.out.println("MonthlyGst: " + monthlyGst);
		
		
	}
	
	void calculateMonthlySalary() {
		
		monthlySalary = monthlySalary - monthlyGst - monthlyPf;
		System.out.println("MonthlySalary: " + monthlySalary);
		
	}
	
	void calculateAnnualGst() {
		
		annualGst = monthlyGst * 12;
		System.out.println("AnnualGst: " + annualGst);
		
	}
	
	void calculateAnnualPf() {
		
		annualPf = monthlyPf * 12;
		System.out.println("AnnualPe: " + annualPf);
		
		
	}
	
	void calculateAnnualSalary() {
		
		annualNetSal = monthlySalary * 12;
		System.out.println("AnnualSalary: " + annualNetSal);
		
	}
	
	void displayEmployeeDetails() {
		
		System.out.println("EmployeeName: " + employeeName);
		System.out.println("EmpSalary: " + monthlySalary);
		
	}
 	public static void main(String[] args) {
		
 		Company com = new Company();
 		
 		com.employeeName = "manoj";
 		com.monthlySalary = 10000;
 		com.calculateMonthlyPf();
 		com.calculateMonthlyGst();
 		com.calculateMonthlySalary();
 		com.calculateAnnualGst();
 		com.calculateAnnualPf() ;
 		com.calculateAnnualSalary();
 		com.displayEmployeeDetails(); 
 		
 		
 
 		
	}

}
