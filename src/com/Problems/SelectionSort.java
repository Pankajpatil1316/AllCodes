package com.Problems;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,6,8,2,5,7,9,3,2};
        int len=arr.length;
        for(int i=0; i<len-1; i++){
            int min=i;
            for(int j=i+1; j<len; j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
