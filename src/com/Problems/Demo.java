package com.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

        int[][] arr = {{1,2,4,2,5}, {1,8,6,4,32}};

        int[] a = Stream.of(arr).flatMapToInt(Arrays::stream).toArray();
        List<Integer>l = Stream.of(arr).flatMapToInt(Arrays::stream).boxed().toList();
        System.out.println(Arrays.toString(a)+"  "+ l);


        int[]a1={1,3,5,7,8,2}, a2= {525,7,2,25,8,8,6};
        int[]aar= Stream.of(a1, a2).flatMapToInt(Arrays::stream).toArray();
        List<Integer>l2 =Stream.of(a1,a2).flatMapToInt(Arrays::stream).boxed().toList();
        System.out.println(Arrays.toString(aar)+"  "+ l2);
    }

}
