package com.Wissen;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9, 11};
        int target=14;

        getTwoSumArray(arr, target);


    }

    private static void getTwoSumArray(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> pairs = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int reaminingNumber = target - arr[i];
            if(map.containsKey(arr[i]))
            {
                pairs.put(arr[i], reaminingNumber);
                //System.out.println(arr[i] + "," +reaminingNumber);
            }else {
                map.put(reaminingNumber, arr[i]);
            }
        }

        System.out.println(pairs);

    }


}
