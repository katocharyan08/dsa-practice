package com.dsa.sortingalgo;

import java.util.Arrays;

public class MissingDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};//1 to n range
        
        System.out.println(Arrays.toString(findMissDuplicate(arr)));
           
    }
    static int[] findMissDuplicate(int[] nums){
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct_index = nums[i] - 1;
           if(nums[i] != nums[correct_index]){
            //swap
            int temp = nums[i];
            nums[i] = nums[correct_index];
            nums[correct_index] = temp;
           } else{
            i++;
           }
        }
        //comapre
        for(int index = 0;index < n; index++){
            if(nums[index] != index + 1){
                return new int[] {nums[index] , index + 1};
            }
        }
        return new int[] {-1,-1};
    }
}
