package com.Wissen;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 6, 1, 4};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int n : arr){
            if(set.contains(n)){
               duplicates.add(n);
            }else set.add(n);
        }
    System.out.println(duplicates);

        Set<Integer> s = new HashSet<>();
        List<Integer> list = Arrays.stream(arr).filter(n-> s.add(n)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
