package com.Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array= {1, 2, 3, 4, 5};

        int start=0, end=array.length-1;

        while (start<end)
        {
            int temp = array[start];
            array[start]=array[end];
                    array[end]=temp;
        }
        System.out.println("p");
        System.out.print(Arrays.toString(array));
    }
}
