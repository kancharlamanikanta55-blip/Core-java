package myfirstjavaproject;

public class WordIndices {

	public static void main(String[] args) {
		String s = "Java is simple0";
		int i = 0;
		
		while (i < s.length()) {
		while (i < s.length() && s.charAt(i) == ' ') i++;
		if ( i >= s.length()) break;
		  int start = i;
		  while (i <= s.length() && s.charAt(i) != ' ') i++;
		  int end = i - 1;
		  String word = s.substring(start, i);
		  System.out.println(word + " - (" + start + " , " + end + ")");
		  
		}
	

	}

}


// {8,4,6,2,4};