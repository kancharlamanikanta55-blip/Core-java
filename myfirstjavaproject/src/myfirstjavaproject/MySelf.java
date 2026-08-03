package myfirstjavaproject;

public class MySelf {
	// we can write in class method only instance class and static class only in myself class 
	// static method
// instance class

	static String myLocation;
	int pinCode;
	int phNumber;
	String presentSituation;
	
	void money() {
		System.out.println("No Money");
	}
	
	
	static void myClass() {
		System.out.println("HEllO JAVA");
	}
	
	
	static String myName;
	static int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		myName = "Manikanta";
		age = 24;
		myLocation = "Rachavaripalem";
		
		System.out.println("Full Name : " + myName);
		System.out.println("Current Age : " + age);
		System.out.println("Current Location : " + myLocation);

		MySelf mk = new MySelf();
		
		MySelf mani =new MySelf();
		mani.money();
		
		System.out.println("MySelf.myClass");
		
		mk.pinCode = 523211;
		mk.phNumber = 9121343;
		mk.presentSituation = "Complete My Graduvation";
		
		System.out.println("Pin Code : " +mk.pinCode);
		System.out.println("MobileNum : " + mk.phNumber);
		System.out.println("Stetus: " + mk.presentSituation);
	}

}
