package com.dsa.recursion;

public class RotatedSorted {
     public static void main(String[] args) {
        int[] arr = {5,6,1,2,3};
        System.out.println(find(arr, 6, 0, arr.length-1));
     }
     static int find(int[] arr, int target,int s , int e){
            if(s > e){
                return -1;
            }
            int mid = s + (e - s)/2;
            if(arr[mid] == target){
                return mid;
            }
            //case 1
            if(arr[s] < arr[mid]){
                //check 
                if(target >= arr[s] && target<= arr[mid]){
                    return find(arr, target, s, mid - 1);
                }
                else{
                    return find(arr, target, mid + 1, e);
                }
            }
            //case 2
        if(target >= arr[mid] && target <= arr[e]){
            return find(arr, target, mid + 1, e);
        }
        else{
            return find(arr, target, s, mid - 1);
        }      
     }
}

