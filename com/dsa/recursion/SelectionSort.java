package com.dsa.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        selectionSort(arr, 5, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] < arr[max]){
                selectionSort(arr, r, c+1, max);
            }
            else{
                selectionSort(arr, r, c+1, c);
            }
        }
        else{
            //swap
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }
}
