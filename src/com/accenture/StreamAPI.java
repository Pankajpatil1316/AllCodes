package com.accenture;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        String string = "pankaj is A good Boy";
        long count = string.toLowerCase().chars().filter(c-> c=='a').count();
        System.out.println("Count is  " + count);


        String str1="listen", str2="listen";
        String word1 = str1.chars().sorted().mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
        String words2 = str2.chars().sorted().mapToObj(c->String.valueOf(c)).collect(Collectors.joining());
        System.out.println("Is anagram " + word1.equals(words2));

        List<String> employees = Arrays.asList("Ankit", "Ravi", "Amit", "Neha", "Alok", "Ramesh");
        char target = 'A';
        Map<Boolean, List<String>> map = employees.stream().collect(Collectors.partitioningBy(str -> str.startsWith(String.valueOf(target))));
        System.out.println(map.get(true));
    }
}
