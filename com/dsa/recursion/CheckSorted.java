package com.dsa.recursion;

public class CheckSorted {
    public static void main(String[] args) {
      int[] arr = {1,3,-7,4,5};
      System.out.println(check(arr, 1));
    }
    static boolean check(int[] arr,int i){
         //basecase2
        if(arr[i-1] > arr[i]){
            return false;
        }
        //basecase1
        if(i == arr.length - 1){
            return true;
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
