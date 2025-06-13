package com.streamapi;

import java.util.stream.Stream;

public class StreamExample3 {

    public static void main(String[] args) {

        String string = "Pankaj patil mangaon hatkanangale";

        long count = string.toLowerCase().chars().filter(c-> c=='p').count();
        System.out.println(count);
    }
}
