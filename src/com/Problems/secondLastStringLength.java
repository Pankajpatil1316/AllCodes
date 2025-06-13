package com.Problems;

public class secondLastStringLength {
    public static void main(String[] args) {

        String s = "   This is a     javac        interview     ";

        System.out.println("Length of last word is " + calculateLength(s));
    }

    static int calculateLength(String str){
        int length=0, wordCount=0;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)!=' '){
                length++;
                if(str.charAt(i-1)==' '){
                    wordCount++;
                    if(wordCount==2){
                        return  length;
                    }
                    length=0;
                }
            }
        }
        return 0;
    }
}
