package com.dsa.sortingalgo;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
          int[] arr = {1,2,3,4,5};
          bubbleSort(arr);
          System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        //if array is already swapped
        boolean swapped; 
        //outer loop for counter or passes
        //steps runs N-1 times
        for(int i = 0;i < arr.length;i++){
            //default
            swapped = false;
            //for each step,largest element come at the last respective index
            for(int j = 1;j < arr.length - i;j++){
               //swap the element if the previous item is larger 
               if(arr[j] < arr[j-1]){
                //swap
                int temp = arr[j];
                  arr[j] = arr[j-1];
                arr[j-1] = temp;

                swapped = true;
               }
            }
            if(swapped == false){
                break;
            }
        }
    }
}