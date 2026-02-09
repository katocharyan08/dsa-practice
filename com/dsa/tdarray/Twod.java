package com.dsa.tdarray;

public class Twod {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
         arr[0] = new int[2];
         arr[0][1] = 44;
         System.out.println(arr[0][1]);
      
         int[][] arr1 = {{1,2,3,4},
                         {5,6,7},
                         {8,9,10,11,12}} ;
            //for each
            for(int[] nums1 : arr1)   {
                for(int nums2 : nums1){
                    System.out.println(nums2);
                }
            }          

    }
}
