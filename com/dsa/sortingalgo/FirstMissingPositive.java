package com.dsa.sortingalgo;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int arr[] = {1,2,0};
        System.out.println(cyclicSort(arr));

    }
    static int cyclicSort(int[] nums){
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct_index = nums[i] - 1;
            if( nums[i] <= n && nums[i] > 0 && nums[i] != nums[correct_index]){
                //swap
                int temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }else{
                i++;
            }
        }
        for(int index = 0;index < n;index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        //if all element are sorted and not missing 
        return n + 1;
    }
}
