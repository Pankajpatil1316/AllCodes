package com.Wissen;

import java.util.Arrays;

public class MeringOfSortedArray {

    public static void main(String[] args) {

        int[] array1 = {1,3,5,7,9,11};
        int[] array2 = {2,4,6,8,10,12,14,16};
        int[] finalArray = new int[array1.length+array2.length];
        int i=0,j=0, n=0;
        while (i<array1.length && j<array2.length){
            if(array1[i]<array2[j]){
                finalArray[n]=array1[i];
                i++;
            }else {
                finalArray[n]=array2[j];
                j++;
            }
            n++;
        }

        if(i<array1.length){
            while (i<array1.length){
                finalArray[n]=array1[i];
                i++;
                n++;
            }
        }else {
            while (j<array2.length){
                finalArray[n]=array2[j];
                j++;
                n++;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
