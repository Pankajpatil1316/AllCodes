package com.Problems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

     int[] arr1= {1,3,5,7,9,11,13};
     int []arr2={2,4,6,8,10};

     int result[] = new int[arr1.length+arr2.length];
     int i=0,j=0,k=0;
     while (i<arr1.length && j<arr2.length){
         result[k++]= arr1[i]<arr2[j]?arr1[i++]:arr2[j++];
     }

     while (i<arr1.length){
         result[k++]=arr1[i++];
     }

     while (j<arr2.length){
            result[k++]=arr2[j++];
        }

     System.out.println(Arrays.toString(result));
    }

}
