package com.accenture;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {

        //Logic Number 1 using Mod
        int[] arr = {7,6,5,4,3,2};
        int n =1,  length = arr.length;
        int newArray[] = new int[length];
        for(int i=0; i< length; i++){
            newArray[(i+n)%length] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));
        anotherLogic();
    }

    static void anotherLogic(){
        int[] arr = {7,6,5,4,3,2};
        int n =1, length=arr.length, temp=arr[length-1];
        for(int i=length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
