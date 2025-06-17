package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample3 {

    public static void main(String[] args) {

        String string = "Pankaj patil mangaon hatkanangale";
        long count = string.toLowerCase().chars().filter(c-> c=='p').count();
        System.out.println(count);

        List<String> list = Arrays.asList("pankaj", "patil", "mangaon", "kolhapur");
        list.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.print(" " + str));

        //"String started with Specific Characters
        list.stream().filter(str -> str.startsWith("p")).forEach(str ->System.out.print( " " + str));


        List<String> employees = Arrays.asList("Ankit", "Ravi", "Amit", "Neha", "Alok", "Ramesh");
        char target = 'A';
        Map<Boolean, List<String>> map = employees.stream().collect(Collectors.partitioningBy(name -> name.startsWith(String.valueOf(target))));
        System.out.println();System.out.println(map);
    }
}
