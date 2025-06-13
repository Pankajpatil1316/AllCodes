package com.Problems;

import java.util.HashSet;
import java.util.Set;


// ISO gram means string could not have repeated character
public class IsoGram {
	
	public static void main(String[] args) {
		String str="pankjdge";
		
		System.out.println(isIsoGram(str));
	}

	static boolean isIsoGram(String str) {
		
		char[] charString = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		
		for(char c: charString)
		{
			if(set.contains(c))
				return false;
			set.add(c);
		}
			return true;
	}
}
