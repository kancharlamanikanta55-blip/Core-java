package MiniProjects;

public class PrintNum {

	public static void main(String[] args) {
		System.out.println("main method");

		printnumbers(1);
	}

	static void printnumbers(int n) {
		if (n > 100) {
			return;
		}
		System.out.println(n + " ");
		printnumbers(n + 1);
	}
}
