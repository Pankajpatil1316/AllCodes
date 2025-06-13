package com.Wissen;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "bca"));
    }

    static boolean isAnagram(String s1, String s2){
        int[] arr = new int[26];
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
        }

        for (int i=0; i<s1.length(); i++)
        {
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int n : arr){
            if(n!=0)
                return false;
        }
        return true;
    }
}
