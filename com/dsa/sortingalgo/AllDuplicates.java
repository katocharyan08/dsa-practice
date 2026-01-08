package com.dsa.sortingalgo;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 3, 2, 1 };
        AllDuplicates obj = new AllDuplicates();
        List<Integer> result = obj.findAllDuplicates(nums);
        System.out.println(result);
    }

    // non primitive so while calling this in main function create object
    List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while (i < nums.length) {
            // if (nums[i] != i + 1) {//this statement tell us about the element is not at
            // the correct index
            int correct_index = nums[i] - 1;
            if (nums[i] != nums[correct_index]) {// this statement tell us that element at the current index
                // and element at the correct index are different so swap
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
                // } else {// otherwise element is duplicate
                //  list.add(nums[i]);
            } else {
                i++;
            }
        }
        // compare
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != index+1){
                list.add(nums[index]);
            }
        }

        return list;
    }

}
