package myfirstjavaproject;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Pairsum {

	public static void main(String[] args) {
		int[] arr = {1,2,7,8,9};
		int target = 9;
		
		HashSet seen = new HashSet();
		String pairs = new LinkedHashSet<>();
		
		for (int num : arr) {
			int diff = target - num;
			if (seen.contains(diff)) {
				int a = Math.min(num, diff), b = Math.max(num, diff);
				pairs.add("(" + a + " , " + b + ")");
			}
			seen.add(num);
		}
		System.out.println("Pairs: ");
		System.out.println(String.join(", ", pairs));
		

	}

}
