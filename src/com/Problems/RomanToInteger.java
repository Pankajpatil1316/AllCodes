package com.Problems;

import java.util.HashMap;

public class RomanToInteger {
	
	public static void main(String[] args) {
		
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
		int sum=0;
		roman.put('I',1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		for(int i=0; i<s.toCharArray().length; i++)
		{
			if(i+1!=s.toCharArray().length && roman.get(s.charAt(i))<roman.get(s.charAt(i+1)))
			{
				sum += roman.get(s.charAt(i+1))-roman.get(s.charAt(i));
				i++;
			}
			else
			{
				sum+=roman.get(s.charAt(i));
			}
		}
		
		return sum;
		
    }
}
