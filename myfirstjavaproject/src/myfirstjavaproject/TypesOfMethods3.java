package myfirstjavaproject;

public class TypesOfMethods3 {

	int addition(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;

	}

	int Subtraction(int a, int b) {
		int result = a - b;
		System.out.println(result);
		return result;
	}

	int Multiplication(int a, int b) {
		int result = a * b;
		System.out.println(result);
		return result;
	}

	int Division(int a, int b) {
		int result = a / b;
		System.out.println(result);
		return result;
	}


	public static void main(String[] args) {
		TypesOfMethods3 m = new TypesOfMethods3();
		
	  int add=m.addition(10, 30);
	  int sub = m.Subtraction(add, 30);
	  int mul = m.Multiplication(sub, 40);
	  int div = m.Division(mul, 50);

	}

}
