package com.Problems;

public class FindIndexOfSubArray {
    public static void main(String[] args) {


            System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {

        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
