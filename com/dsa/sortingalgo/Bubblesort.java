package com.dsa.sortingalgo;
import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args){
          int[] arr = {5,3,2,6,4};
          System.out.println("before : {5,3,2,6,4}");
          bubbleSort(arr);
          System.out.println("after : "+ Arrays.toString(arr));
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

                swapped = true;//its only true when if statement hits
               }
            }
            if(swapped == false){
                break;
            }
        }
    }
}