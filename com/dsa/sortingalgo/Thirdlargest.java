package com.dsa.sortingalgo;
import java.util.Arrays;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
       // int sort =   count(bubbleSort(arr));  MISTAKE
           //now time for count method
           bubbleSort(arr);//array changed
           System.out.println(Arrays.toString(arr));//prinnt new non decresing array
           System.out.println(count(arr)); 
    }
     static int count(int[] arr){
    // int arr =  bubbleSort(arr); //MISTAKE
        int prevElem = arr[0];
        int elemCount = 1;
        for(int i = 1; i < arr.length;i++){
        if(prevElem != arr[i]){
           elemCount += 1;
           prevElem = arr[i];
        }
        if(elemCount == 3){
            return arr[i];
        }
        
        }
        return arr[0];
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

