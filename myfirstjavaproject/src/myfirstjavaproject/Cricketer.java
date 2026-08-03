package myfirstjavaproject;

public class Cricketer {
	
	static String countryName;
	static String boardName;

	 String cricketerName;
     int jerseyNo;
	 int age ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countryName = "India";
		boardName = "IND";
			    
	    System.out.println("*********************************************************");

	    Cricketer vk = new Cricketer();
	    vk.age=46;
	    vk.cricketerName = "Vk";
	    vk.jerseyNo = 18;
	    
	    System.out.println("Cricketer Age : " + vk.age);
	    System.out.println("Cricketer Name : " + vk.cricketerName);
	    System.out.println("Cricketer jerseyNo : " + vk.jerseyNo);

	    System.out.println("Country : " + countryName);
	    System.out.println("Board : " + boardName);
	    
	    
	    
	    System.out.println("*********************************************************");

	    Cricketer dhoni = new Cricketer();
	    dhoni.age= 50;
	    dhoni.cricketerName = "Dhoni";
	    vk.jerseyNo = 07;

	    System.out.println("Cricketer Age : " + dhoni.age);
	    System.out.println("Cricketer Name : " + dhoni.cricketerName);
	    System.out.println("Cricketer jerseyNo : " + dhoni.jerseyNo);

	    System.out.println("Country : " + countryName);
	    System.out.println("Board : " + boardName);
	    
	    

	    
		

	}

}
