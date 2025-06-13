package com.JavaFeatures;

public class Java11 {
    public static void main(String[] args) {
        //JAVA 11
        //1. blank checks string it blank or not
        //   If string has " " this then it is blank but not empty
        String str = "";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        String multiLine = "pankaj\nprakash\npatil";
        multiLine.lines().forEach(s -> System.out.println(s));

        String repeat = "pankaj";
        System.out.println(repeat.repeat(4));
    }
}
