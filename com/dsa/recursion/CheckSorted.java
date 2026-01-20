package com.dsa.recursion;

public class CheckSorted {
    public static void main(String[] args) {
      int[] arr = {1,8,3,4,5};
      System.out.println(check(arr, 0));
    }
    static boolean check(int[] arr,int i){
        //basecase1
        if(i >= arr.length - 1){
            return true;
        }
        //basecase2
        if(arr[i] > arr[i+1]){
            return false;
        }
        //ye mistake ki maine
        // if(arr[i] < arr[i]+1){
        //     check(arr,i+1);
        // }
        //return false;

        //parr ye recursive call return krni thi return krna tha,at the end of call its only returning true /false
        return check(arr, i+1);
    } 
}
