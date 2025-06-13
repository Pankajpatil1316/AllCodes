package com.Problems;

import java.util.*;

public class VitalEdge {
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
        System.out.println(isSimilar("abc", "ab")); // false
        System.out.println(isSimilar("baat", "bats")); // false
    }

    static boolean isSimilar(String word, String similar) {

        Map<Character, Boolean> map = new HashMap<>();
        for(char c: word.toCharArray())
        {
            map.put(c, false);
        }
        for(int i=0; i<similar.length(); i++)
        {
            if(map.containsKey(similar.charAt(i))){
                map.put(similar.charAt(i), true);
            }else{
                return false;
            }
        }
       return !map.containsValue(false);
    }
}
