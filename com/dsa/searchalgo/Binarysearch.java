package com.dsa.searchalgo;

//import CeilingNum.Binarysearch;
//package dsa.java.searchalgo.java;

public class Binarysearch {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {-12,-9,-5,-2,0,2,4,6,7,8,11,15,19,27,39};
        int target = -2;
        int ans = binarysearch(arr,target);
      System.out.println(ans);
        
    }
    //return index if element found
    //return -1 if element not found
    static int binarysearch(int[] arr,int target){
     //index initialise
         int start = 0;
         int end = arr.length - 1;
          
         while (start <= end){
            //find mid element
            int mid = start + (end - start)/2;//index

            //conditions
            if(target < arr[mid]){
                //then check on left side of mid
                end = mid - 1;
            }
            else if (target > arr[mid]){
                //then check on right side of mid
                start = mid + 1;
            }
            else if(target == arr[mid]){
                return mid;
            }
         }
   //ceilingnum(arr,target);
         return -1;
    }
}
