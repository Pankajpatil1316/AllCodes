package com.Wissen;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "pankaj", "jaknap", "cba", "xyz");
        anagramGroup(list);
    }

    static void anagramGroup(List<String> list){
        Map<String, List<String>> map = new HashMap<>();

        for(String s: list){

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            if(!map.containsKey(sortedKey)){
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(sortedKey, l);
            }else {
                map.get(sortedKey).add(s);
            }

        }

        System.out.println("Anagram List " + map.values());
    }
}
