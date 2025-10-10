//using list

package com.dsa.sortingalgo;

import java.util.ArrayList;
import java.util.List;

public class Disappearednum {
    public static void main(String[] args) {
        int[] nums = { 1, 1 };
        Disappearednum obj = new Disappearednum();
        List<Integer> result = obj.findDisappearedNumbers(nums);
        System.out.println(result);
       }

   public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correct_index = nums[i] - 1;
            // swap
            if (nums[i] != nums[correct_index]) {
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            } else {
                i++;
            }
        }
        // seraching by comparing
        List<Integer> ans = new ArrayList<>();
         for(int index = 0 ; index < n; index++){
            if( nums[index] != index + 1){
                 ans.add(index + 1);//index + 1 is for returning element amd index is only for returning the index
            }
         }
        return ans;
    }
}
