package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class SortMapWithValues {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Orange", 2);
        map.put("Mango", 4);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(m ->
                System.out.println(m.getKey() + " " +m.getValue()));

    }
}
