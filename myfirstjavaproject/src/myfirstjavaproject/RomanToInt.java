package myfirstjavaproject;

import java.util.Map;

public class RomanToInt {
	
	    static int value(char c) {
	        return Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000).get(c);
	    }
	    public static int romanToInt(String s) {
	        int total = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int curr = value(s.charAt(i));
	            int next = (i + 1 < s.length())? value(s.charAt(i + 1)) : 0;
	            if (curr < next) total -= curr;
	            else total += curr;
	        }
	        return total;
	    }
	    public static void main(String[] args) {
	        System.out.println(romanToInt("IX")); // 9
	        System.out.println(romanToInt("MCMIV")); // 1904
	        System.out.println(romanToInt("XL")); // 40
	    }
	}

	