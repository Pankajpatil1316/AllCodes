package com.Problems;

import java.util.Arrays;
import java.util.List;

public class LengthOfClassWord {
    public static void main(String[] args) {

        String s ="Pankaj prakash patil ";
        List<String> list = Arrays.stream(s.trim().split(" ")).toList();
        System.out.println(list.getLast().length());
    }
}
