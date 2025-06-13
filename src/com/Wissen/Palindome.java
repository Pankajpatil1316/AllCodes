package com.Wissen;

public class Palindome {

    public static void main(String[] args) {
        String str = "nitin";
        char[] charArray = str.toCharArray();
        int j= charArray.length-1;
        boolean flag=true;
        for(int i=0; i<charArray.length/2; i++){
            if(charArray[i]!=charArray[j]){
                flag=false;
                break;
            }
            j--;
        }

        System.out.println(flag);
    }
}
