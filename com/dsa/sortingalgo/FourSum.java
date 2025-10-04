package com.dsa.sortingalgo;

public class FourSum {
    public static void main(String[] args) {
    	int[] nums = {1,0,-1,0,-2,2};
    	System.out.println(ksum(nums, 0));
    	
    }
	 public static int ksum(int[] nums,int target) {
     	  insertionSort(nums);
		  int n = nums.length; 
		  for(int i = 0; i < n;i++){
			//for duplicates
			while(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
             for(int j = i + 1;j < n;){
				//now two pointer approach
				int p = j + 1;
				int q = n - 1;
				while(p < q){
					int sum = nums[i] + nums[j] + nums[p] + nums[q];
				if(sum == target){
					//return {p,q};
                  p++;
				  q--;
				}	
				else if(sum < target){
                    p++;
				}
				else{
					q--;
				}
				//for dublicates
				while(p < q && nums[p] == nums[p-1]){
                    p++;
				}
				}
				//for duplicates
				j++;
				while(j < n && nums[j] == nums[j-1]){
					j++;
				}
			 }
		  }
         	return 0;
         }
       
    public static void insertionSort(int[] nums) {
        	//passes
    	   for(int i = 0;i <= nums.length - 2;i++) {
    		   for(int j = i + 1;j > 0;j--) {
    			   //swap
    			   if(nums[j] < nums[j-1]) {
    				  int temp = nums[j];
    				  nums[j] = nums[j-1];
    				  nums[j-1] = temp;
    			   }
    			   else {
    				   //already sort
    				   break;
    				   
    			   }
    		   }
    	   }
      }
}
