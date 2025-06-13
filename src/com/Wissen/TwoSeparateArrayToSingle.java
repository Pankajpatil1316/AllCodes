package com.Wissen;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoSeparateArrayToSingle {
    public static void main(String[] args) {

        int[] arr1 = {1,2,5,6,7,7};
        int[] arr2 = {1,6,7,2,1,6,7,};
        int [] arr = Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(arr));


        int[][] array2D = {{1,3,5,7,8,9},{8,6,5,1,23,5}};
        int[] arrFrom2D = Stream.of(array2D).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(arrFrom2D));
    }
}
