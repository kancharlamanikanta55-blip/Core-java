package MiniProjects;

public class MissinngNum {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 7, 9 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i]; j < arr[i + 1]; j++)
				System.out.print(j + " ");
		}

	}

}
