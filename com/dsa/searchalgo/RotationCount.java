package com.dsa.searchalgo;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {9,1,2,3,4,5,6,7,8};//no duplicates
        int k = search(arr);
        System.out.println("Number of rotation count is "+k);
    }
    
    static int search(int[] arr){
        int pivot = findpivot(arr);
        return pivot +1;
    }
    
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

        if(arr[mid-1] > arr[mid]){
            return mid - 1;
        }
        if(arr[mid] > arr[mid+1]){
            return mid;
        }
        if(arr[start] > arr[mid]){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    } 
    return -1;

    }
}