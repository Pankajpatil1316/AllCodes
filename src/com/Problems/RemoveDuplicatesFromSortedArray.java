package com.Problems;



public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,2,3,4,5,6,6,7,8,9,9};
		
		int sizeAfterDuplicatesRemoved = removeDuplicates(nums);
	
		for(int i=0; i<sizeAfterDuplicatesRemoved; i++)
		{
			System.out.print(nums[i]+" ");			
		}
	}
	public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;

		int i=0;
		for(int j=1; j<nums.length; j++)
		{
			if(nums[i]!=nums[j])
			{
				i++;
				nums[i]=nums[j];
			}
		}
     return i+1;   
        
    }
}
