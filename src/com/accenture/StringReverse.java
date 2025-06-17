package com.accenture;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Pankaj";
        char[] charArray = str.toCharArray();
        int l = charArray.length-1;
        for(int i=0; i<charArray.length/2; i++){
            char temp = charArray[i];
            charArray[i]=charArray[l];
            charArray[l]=temp;
            l--;
        }
        String newString = new String(charArray);
        System.out.println(newString);
    }
}
