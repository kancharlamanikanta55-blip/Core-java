package MiniProjects;

import java.util.Scanner;

public class AlphabetCharEvenNum {

	public static void main(String[] args) {
		System.out.println("Main method");
		alphabetChar();
		
	}

	static void alphabetChar() {
		for (int i = 'A'; i <= ('A' + 26); i++) {
			if (i % 2 == 0) {
				System.out.print((char)i);
				System.out.print("->");
				System.out.println(i);
			} 
		}
		

	}

}
