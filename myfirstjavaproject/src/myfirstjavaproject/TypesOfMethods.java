package myfirstjavaproject;

public class TypesOfMethods {
	
	void addition(int a,int b) {
		int result = a + b;
		System.out.println("Addition: " + result);
		Subtraction(result, 15);
		
	}
	
	void Subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Sub: " + result);
		Division(result, 20);
	}
	
	void Division(int a, int b) {
		int result = a / b;
		System.out.println("Division: " + result);
		Multiplication(result, 40);
	}
	
	void Multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Multi: " + result);
		
	}
	

	public static void main(String[] args) {
		TypesOfMethods m = new TypesOfMethods();
		
		m.addition( 10, 30);
		
	}

}
