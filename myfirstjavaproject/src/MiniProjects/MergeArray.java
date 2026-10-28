package MiniProjects;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		int[] b1 = { 4, 5, 6 };
		int[] c1 = new int [a1.length+b1.length];
		for (int i = 0; i < a1.length; i++) {
			c1[i] = a1[i];

		}
		for (int j = 0; j < b1.length; j++) {
			c1[a1.length+j ] = b1[j];
			
		}
		System.out.print(Arrays.toString(c1));
	}
	
}
