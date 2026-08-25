package myfirstjavaproject;

public class InstanceAndStatic {

	int addition(int a, int b) {
		int result = a + b;
		System.out.println("Addition: " + result);
		int x = Subtraction(result, 2);
		return result;

	}

	int Subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Sub: " + result);
		int x = Multiplication(result, 2);
		return result;
	}

	static int Multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Mul: " + result);
		int x = Division(result, 2);
		return result;
	}

	static int Division(int a, int b) {
		int result = a / b;
		System.out.println("Divi: " + result);
		return result;
	}

	public static void main(String[] args) {
		InstanceAndStatic i = new InstanceAndStatic();
		int add = i.addition(10, 30);

	}

}
