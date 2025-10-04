package com.dsa.sortingalgo;

import java.util.Arrays;

public class Cyclicsort{
    public static void main(String[] args){
        //numbers from the range 1 to n
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] nums){
        int n = nums.length;
        int i = 0;
           while(i < n){
            //Where to place the element? at index = value - 1;
            int correct_index = nums[i] - 1;
            if(nums[i] != nums[correct_index]){
                int temp = nums[i];
                    nums[i] = nums[correct_index];
                    nums[correct_index] = temp;
             }
            else{
                i++;
            }
           }
    }
} 