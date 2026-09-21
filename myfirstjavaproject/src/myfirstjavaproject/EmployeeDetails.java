package myfirstjavaproject;

public class EmployeeDetails {
	
	String employeeName;
	double salary;
	String companyName;
	
	EmployeeDetails(String employeeName, double salary, String companyName) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.companyName = companyName;
	}

	public static void main(String[] args) {

		EmployeeDetails  e  = new EmployeeDetails("sai", 4000, "Soft");
		e.details();
	}

	void details() {
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + salary) ;
		System.out.println("Componey Name : " + companyName);
	}
 }
