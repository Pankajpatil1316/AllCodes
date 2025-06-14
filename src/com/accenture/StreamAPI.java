package com.accenture;

import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        String string = "pankaj is A good Boy";
        long count = string.toLowerCase().chars().filter(c-> c=='a').count();
        System.out.println("Count is  " + count);


        String str1="listen", str2="listen";
        String word1 = str1.chars().sorted().mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
        String word2 = str2.chars().sorted().mapToObj(c -> String.valueOf(c)).collect(Collectors.joining());
        System.out.println("Is Anagram " +  word1.equals(word2));


    }
}
