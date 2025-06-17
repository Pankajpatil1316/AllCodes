package com.accenture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPIGroupBy {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "bat", "banana", "car", "dog","anjali", "anjana", "anil", "pankaj", "patil");

        //Group by there lengths
        Map<Integer, List<String>> groupByLength = words
                .stream()
                .collect(Collectors.groupingBy(word -> word.length()));
        System.out.println("groupByLength " + groupByLength);

        //Group by First Letter
        Map<Character, List<String>> groupByFirstLetter =  words
                .stream()
                .collect(Collectors.groupingBy(word-> word.charAt(0)));
        System.out.println("groupByFirstLetter " +  groupByFirstLetter);

        //Group the Even and Odd Number groups
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String, List<Integer>> groupByEvenOrOdd = numbers
                .stream()
                .collect(Collectors.groupingBy(number -> number % 2 == 0? "Even": "Odd"));
        System.out.println("groupByEvenOrOdd " + groupByEvenOrOdd);

        //Group by Frequency of Characters in a String
        String input = "banana";
        Map<Character, Long> groupByFrequency = input
                .chars()
                .mapToObj(c -> (char )c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("groupByFrequency " + groupByFrequency);
    }
}
