package com.Wissen;

public class RotateMatrixBy90Degree {
//InPut
//    1 2 3
//    4 5 6
//    7 8 9

//OUTPUT
//      7 4 1
//      8 5 2
//      9 6 3

    public static void main(String[] args) {
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr2D.length;
        for(int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                int temp = arr2D[i][j];
                arr2D[i][j]=arr2D[j][i];
                arr2D[j][i]=temp;
            }
        }

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(" " + arr2D[i][j]);
            }
            System.out.println();
        }
    }
}
