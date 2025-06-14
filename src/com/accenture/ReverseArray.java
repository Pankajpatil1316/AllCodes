package com.accenture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,7,2,7,0,3,1,7,9,3};
        int j=arr.length-1;
        for(int i=0; i<arr.length/2; i++){

            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));


    }
}
