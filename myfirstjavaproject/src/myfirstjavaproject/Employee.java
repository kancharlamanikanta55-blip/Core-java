package myfirstjavaproject;

public class Employee {
	int emId;
	String emName;
	
	static int pinId = 523211;
    static String location = "hyd";

  
	//static int pinid = 4321;
    //static String location = "ogl"; 
    
    
	public static void main(String[] args) {
	
	   
	    System.out.println(pinId);
	    System.out.println(location);
	    

	   // System.out.println(pincode);
	   // System.out.println(locationName);
	    
	    
	    Employee emp = new Employee();
	    emp.emId=102;
	    emp.emName = "Manikanta";
	    System.out.println("Employee Id : " + emp.emId);
	    System.out.println("Employee Name : " + emp.emName);
	    
	    
	    Employee person = new Employee();
	    person.emId= 555;
	    person.emName = "Manik";
	    System.out.println("Employee Id : " + person.emId);
	    System.out.println("Employee Name : " + person.emName);
	    

	}

}
