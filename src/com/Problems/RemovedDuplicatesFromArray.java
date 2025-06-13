package com.Problems;

import java.util.Arrays;

public class RemovedDuplicatesFromArray {
    public static void main(String[] args) {

        int[] arrayWithDuplicates = {1, 2, 3, 4, 5, 2, 3, 6, 1};
        Arrays.sort(arrayWithDuplicates);
        System.out.println(Arrays.toString(arrayWithDuplicates));
        int n=1;
        for(int i=1; i<arrayWithDuplicates.length; i++)
        {
            if(arrayWithDuplicates[i]!=arrayWithDuplicates[i-1])
            {
                arrayWithDuplicates[n]=arrayWithDuplicates[i];
                n++;
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arrayWithDuplicates[i]);
        }
    }
}
