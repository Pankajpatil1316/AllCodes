package com.accenture;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {3,6,8,2,5,7,9,3,2,7,9,9,3,2,6};
        int j=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<arr.length; i++) {
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        for(int i=0; i<j; i++){
            System.out.print(" " + arr[i] );
        }
    }
}
