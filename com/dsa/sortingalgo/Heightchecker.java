package com.dsa.sortingalgo;

import java.util.Arrays;

public class Heightchecker {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        int[] height = {1,1,4,2,1,3};
        
        System.out.println("current order: "+Arrays.toString(height));
        int count = 0;
//System.out.println(height[4]);//1
        insertionSort(arr);
        System.out.println("expected order : "+ Arrays.toString(arr));
//System.out.println(height[4]);//3
//System.out.println(arr[4]);//3
        for(int i = 0; i < arr.length;i++){
             if(height[i] != arr[i]){
                  count++;
             }
        }
        System.out.println("indices : "+count);
    }
    static void insertionSort(int[] arr){//it is a stable sorting
       //passes -> outer loop till n - 2
        for(int i = 0;i <= arr.length - 2;i++){
           for(int j = i + 1;j > 0;j--){
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
            }
            else{
                //to reduce swaps 
                break;
            }
           }
        }
    }
}
