package com.Wissen;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }
    static boolean isPalindrome(){
        int n =1234321;
        int original =n, newNo=0;
        while (n>0){
            int digit = n%10;
            newNo = newNo*10 + digit;
            n= n/10;
        }

        return  newNo==original;
    }
}
