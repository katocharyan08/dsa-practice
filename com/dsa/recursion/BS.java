package com.dsa.recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,12,23,36,67,78};
        int target = 78;
        System.out.println(search(arr,target,0,arr.length-1));
    }

     static int search(int[] arr, int target, int s, int e) {
        int m = s + (e - s)/2;
        if(s > e){//break statement
            return -1;
        }
        if(arr[m]== target){
            return m;
        }
        if( arr[m] < target){
            return search(arr,target,m + 1,e);
        }

        return search(arr, target, s, m - 1);        
    }
    
}
