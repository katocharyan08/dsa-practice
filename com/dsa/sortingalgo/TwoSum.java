package com.dsa.sortingalgo;

public class TwoSum{
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,10,11,15};
		int target = 20;
		if(twoPointer(arr,target)){
			System.out.println("True");
		}
		else{
			System.out.println("false");
		}
	}
	//using two pointer technique
	static boolean twoPointer(int[] nums , int target) {
		int left = 0; //pointer
		int right = nums.length - 1; //pointer
		
		    while(left < right) {
		    	int current_Sum = nums[left] + nums[right];
			//condition
			if(current_Sum == target){
               return true;
			}	
			else if(current_Sum > target){
				right--;
			}
			else{
				left++;
			}

		    }
		return false;
	}
}