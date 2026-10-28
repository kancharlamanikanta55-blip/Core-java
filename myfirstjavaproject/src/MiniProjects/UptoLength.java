package MiniProjects;

public class UptoLength {

	public static void main(String[] args) {
		System.out.println("Main method");

		int n = 12131456;

		int count = 0;
		int num = n;
		int div = 10;
		while (n > 0) {
			n= n / 10;
			count++;

		}
		for (int i = 1; i <= count; i++) {
			int num1 = num;
			while (num1 > 0) {
				int dig = num1 % div;
				if(dig>1) {
				boolean prime = true;

				for (int j = 2; j < dig; j++) {
					if (dig % j == 0) {
						prime = false;
					}
				}
				if (prime) {
					System.out.println(dig);
				}
				}
				num1 = num1 / div;
			}
			div = div * 10;
		}
	}

}
