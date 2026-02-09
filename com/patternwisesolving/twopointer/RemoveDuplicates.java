package com.patternwisesolving.twopointer;
//problem : remove the duplicates in-place, in a sorted array and return unique element array
//intiution : inplace and removing trigger slow fast pointer
//approach : In slow fast pointer,fast scans for different number ,slow  write when new value appears
//Time complexity : O(n) and space complexity : O(1)
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(remove(arr));
    }
    static int remove(int[] nums){
         int slow = 1;//because at index 0 alement is unique
         for(int fast = 1;fast <= nums.length -1;fast++){
             if(nums[fast] != nums[slow - 1]){//checking with slow -1 because it satisfy invarient
                nums[slow] = nums[fast];
                slow++;
             }
         }
         return slow;//new array length is equal to slow
    }
}
