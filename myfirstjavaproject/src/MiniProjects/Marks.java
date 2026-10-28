package MiniProjects;

public class Marks {

	public static void main(String[] args) {
		int arr[] = { 36, 45, 78, 66, 99 };

		for (int i = 0; i < arr.length; i++) {
			int r = arr[i] % 10;
			int s = arr[i] - r;

			if (r > 5) {
				arr[i] = s + 10;

			} else {
				arr[i] = s;
			}
		}
		for(int n : arr) {
			System.out.println(n);
		}
	}
}
