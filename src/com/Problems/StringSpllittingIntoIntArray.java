package com.Problems;

import java.util.Arrays;

public class StringSpllittingIntoIntArray {
    public static void main(String[] args) {

        String s = "192.168.1.0";

        int[] arr = Arrays.stream(s.split("\\.")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
