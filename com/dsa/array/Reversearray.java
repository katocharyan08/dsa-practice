package com.dsa.array;
import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,11,66,9,0,7};
        toreverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void toreverse(int[] arr){
               int start = 0;
               int end = arr.length -1;
        while(start<end){
        int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
           start++;
           end--;
    }
}
}
