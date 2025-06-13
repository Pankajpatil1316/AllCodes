package com.Problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {


    public static void main(String[] args) {


        int [] arr1={1,3,5,7,9};
        int [] arr2={2,4,6,8};
        int [] arr3={0};


        List<Integer> list1 = Arrays.asList(1,2,4,5,67,3);
        List<Integer> list2 = Arrays.asList(8,3,5,45,14,1,5,6);
        List<Integer> list3 = Arrays.asList(34,67,2,7,9,235,1);

        List<Integer> lasd = Stream.of(list1,list2,list3).flatMap(List::stream).toList();

        List<Integer> list = list1.stream().filter(n->n%2==0).toList();
        int[] arr = Arrays.stream(arr1).filter(n->n%2==0).toArray();

        int [][] array = {{1234,35,4,2,5},{2,4,6,7,2235,3}};
        int[] l = Stream.of(array).flatMapToInt(Arrays::stream).toArray();
        int[] ll = Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(l));
    }


}
