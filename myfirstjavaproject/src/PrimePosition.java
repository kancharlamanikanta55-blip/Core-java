
public class PrimePosition {

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int num = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = i + j;
				if (isprime(sum)) {
					arr[i][j] = num;
					int n = num + 1;
					while (!isprime(n)) {
						n++;
					}
					num = n;
				}
			}
		}
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isprime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;
	}
}
