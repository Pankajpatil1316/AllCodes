package com.Problems;

import java.util.*;

public class ReverseStringWords {

    public static void main(String[] args) {
        String s = "  this   is a mr pankaj ";

        StringBuilder word = new StringBuilder();
        List<String> words = new ArrayList<>();

        for(int i=s.length()-1; i>=0; i--){

            if(s.charAt(i)!=' ')
                word.append(s.charAt(i));
            else if(!word.isEmpty()){
                words.add(word.reverse().toString());
                word.setLength(0);
            }
        }

        if(!word.isEmpty())
            words.add(word.toString());

      // Collections.reverse(words);

        String revsersedString = String.join(" ", words);


    }
}
