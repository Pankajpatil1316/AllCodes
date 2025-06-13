package com.Problems;

import java.util.HashMap;

public class DuplicateDigits {

    public static void main(String[] args) {
        int arr[] = {789, 123, 456, 124, 456, 789, 123};
        calculateDuplicates(arr);
    }

    static void calculateDuplicates(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int number : arr){

            while (number>0){
                int digit= number%10;
                map.put(digit, map.getOrDefault(digit, 0)+1);
                number=number/10;
            }
        }

         System.out.println(map);
}

}
