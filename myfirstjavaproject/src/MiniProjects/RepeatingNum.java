package MiniProjects;

public class RepeatingNum {

	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 20, 30, 30, 50 };

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					temp = count;
					arr[i] = temp;
				}
			}
			if(count == 1)
			System.out.println(count);
		}
	}

}
