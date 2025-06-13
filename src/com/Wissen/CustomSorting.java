package com.Wissen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ap", "banana", "kiw","mongo");

        list.sort((a,b)->a.length()<b.length()?1:-1);
        System.out.println(list);
        List<String> sorted = list.stream().sorted((a,b)->a.length()>b.length()?-1:1).collect(Collectors.toList());

        List<String> sorted1 = list.stream().sorted((a,b)->a.charAt(0)>b.charAt(0)?-1:1).collect(Collectors.toList());

        System.out.println(sorted1);
    }
}
