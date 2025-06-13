package com.Problems;

import java.util.HashSet;

public class VitalEdge2 {
    public static void main(String[] args) {
        System.out.println("Similar Strings:");
        final String word = "mary";
        final String similar = "army";
        System.out.println(isSimilar(word, similar)); // true

        // test section
        System.out.println(isSimilar("book", "bok")); // true
        System.out.println(isSimilar("word", "worb")); // false
        System.out.println(isSimilar("b", "bbb")); // true
        System.out.println(isSimilar("abcc", "abbc")); // true
        System.out.println(isSimilar("baat", "bats")); // false
        System.out.println(isSimilar("abc", "ab")); // false
    }

    public static boolean isSimilar(String str1, String str2) {

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        return set1.equals(set2);

    }
}
