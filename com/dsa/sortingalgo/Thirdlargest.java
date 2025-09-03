package com.dsa.sortingalgo;
import java.util.Arrays;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr = {6,7,3,9,8,9,10};
       // int sort =   count(bubbleSort(arr));  MISTAKE
           //now time for count method
   // static int count(int[] arr){
     // int arr =  bubbleSort(arr); //MISTAKE
     bubbleSort(arr);
     System.out.println(Arrays.toString(arr));
        int prev = 0;
        int curr = 1;
        int count = 1;
        for(int i = 0; i < arr.length;i++){
        if(arr[prev] != arr[curr]){
           count++;
        }
        if(count == 3){
            System.out.println(curr); 
        }
        }
        // return -1;
    }  
    
   
    static void bubbleSort(int[] arr){
       boolean swapped;
//count passes
       for(int i = 0;i < arr.length;i++){
        swapped = false;
        for(int j = 1;j <= arr.length - i - 1;j++){
            if(arr[j-1] < arr[j]){//if prev small than current swap
                int temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
                 swapped = true;
            }
        }
        if(!swapped){
            break;
        }
       }
    }
    
}
