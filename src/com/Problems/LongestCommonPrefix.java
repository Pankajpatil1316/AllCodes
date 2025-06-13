package com.Problems;

public class LongestCommonPrefix {
	
	public static void main(String[] args) 
	{
		String[] str = {"flower","flow","flight"};
	//	String[] str = {"aa","a"};
		System.out.println(longestCommonPrefix(str));;
	}
	static String longestCommonPrefix(String[] str) 
	{
		String common = "";
		for(int i=0; i<str[0].length(); i++)
		{
			if(checkChar(str[0].charAt(i), str, i))
			{
				//System.out.println(str[0].charAt(i));
				common+=str[0].charAt(i);
			}
			else
			{
				break;
			}
		}
		return common;
    }
	static boolean checkChar(char charAt, String[] str, int charPosition) {
		for(int i=1; i<str.length; i++)
		{
			if(charPosition< str[i].length() && str[i].charAt(charPosition)==charAt)
			{
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
