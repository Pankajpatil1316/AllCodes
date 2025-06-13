package com.accenture;

public class WordCount {

    public static void main(String[] args) {
        String s = " Pankaj  patil * | patil   pankaj   sdd ";
        boolean inWord = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c>='a'&&c<='z' || c>='A'&&c<='Z') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);
    }

}
