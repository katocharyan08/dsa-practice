package com.patternwisesolving.twopointer;

public class RemoveArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,2,3,3,3,3};
        System.out.println(ans(nums));
        }
        static int ans(int[] nums){
            int slow = 0;
           for(int fast = 0;fast < nums.length;fast++){
            if(slow < 2 || nums[fast] != nums[slow-2]){
                nums[slow] = nums[fast];
                slow++;
            }
           }
           return slow;
        }
}
