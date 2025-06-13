package com.Problems;

import java.util.HashSet;

public class FindDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 2, 3, 6, 1};

        HashSet<Integer> set = new HashSet<>();

        for(int n : arrayWithDuplicates)
        {
            if(set.contains(n)){
                System.out.println(n);
            }else {
                set.add(n);
            }
        }

    }
}
