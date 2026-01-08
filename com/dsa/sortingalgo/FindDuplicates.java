
package com.dsa.sortingalgo;

public class FindDuplicates {
    public static void main(String[] args){
      int[] nums ={1,3,4,2,2};
      System.out.println(cyclicSort(nums));
    }
    static int cyclicSort(int[] nums){
       int i = 0;
       while( i < nums.length){
        if(nums[i] != i+1){
        int correct_index = nums[i] - 1;
        if(nums[i] != nums[correct_index]){
            //swap
            int temp = nums[i];
            nums[i] = nums[correct_index];
            nums[correct_index] = temp;
        }else{
            System.out.print("Duplicate "+nums[i]+" is present at index : ");
               return i;
        }
       }
       else{i++;}
       //now to compare
    //    for(int index = 0;index < nums.length;index++){
    //        if(nums[index] != index + 1){
    //         System.out.print("Duplicate "+nums[index]+" is present at index : ");
    //           return index;
    //        }
    //    }
    }
    return -1;
}
}
