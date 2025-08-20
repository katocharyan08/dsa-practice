package com.dsa.array;

import java.util.*;

public class Pswap {
    public static void main(String[] args) {
        int[] arr = {2,3,55,555,22};
        swap(arr,1,3);
         System.out.println(Arrays.toString(arr));//we do (Arrays.toString(arr)) for printing array.

    }
    static void swap(int[] arr , int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

       
    }
}
