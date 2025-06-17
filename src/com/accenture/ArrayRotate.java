package com.accenture;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2};
        int n =1,  length = arr.length;
        int newArray[] = new int[length];

        for(int i=0; i< length; i++){
            newArray[(i+n)%length] = arr[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
