package MiniProjects;

public class IntArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 60 };
		int sum = 0;
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			product = product * arr[i];
		}
		System.out.println("THe sum of integer: " + sum);
		System.out.println("THe product of integer: " + product);

	}

}
