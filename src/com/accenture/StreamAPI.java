package com.accenture;

public class StreamAPI {
    public static void main(String[] args) {

        String string = "pankaj is A good Boy";
        long count = string.toLowerCase().chars().filter(c-> c=='a').count();
        System.out.println("Count is  " + count);
    }
}
