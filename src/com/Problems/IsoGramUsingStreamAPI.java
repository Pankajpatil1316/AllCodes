package com.Problems;

public class IsoGramUsingStreamAPI {
	
	public static void main(String[] args) {
		
		String str= "pankj";
		
		System.out.println(str.chars().distinct().count()==str.length());
		
		//System.out.println(str.chars().distinct().count()==str.length());
	}
}
