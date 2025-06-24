package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int sum =3;
        int[] arr = {2,3,4,5,6,7,8,9,1};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int temp = sum - arr[i];
            if(map.containsKey(temp)){
                System.out.println(+map.get(temp) +"," + i);
                System.out.println(+  temp + ":" + arr[i] );
                System.out.println();
            }
            map.put(arr[i], i);
        }

    }
    //    public static void main(String[] args) {
//
//        int sum =9;
//        int[] arr = {2,3,4,5,6,7,8,9,1};
//
//        Set<Integer> set = new HashSet<>();
//        for(int i=0; i<arr.length; i++)
//        {
//          int temp = sum - arr[i];
//          if(set.contains(temp)){
//              System.out.print(temp + ":" + arr[i] + ", ");
//          }
//
//            set.add(arr[i]);
//        }
//
//
}
