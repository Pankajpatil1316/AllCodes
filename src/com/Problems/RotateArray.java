package com.Problems;

public class RotateArray {
	
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7};
		int k=2;
		rotate(arr, k);
		
		for(int n:arr)
		{
			System.out.print(n);
		}
	}
	
 static void rotate(int[] nums, int k) 
   {
	 int arrayLength=nums.length;
	 int arr[] = new int[arrayLength];
     for( int i=0; i<arrayLength; i++)
     {
    	arr[(i+k)%arrayLength]=nums[i];
     }
     for( int i=0; i<arrayLength; i++)
     {
    	nums[i]=arr[i];
     }
   }
}
