package com.dsa.sortingalgo;
import java.util.Arrays;

public class Insertionsort {//partially sort array
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertion(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        //outer loop run only till n-2 because for i<n-1 ,j will be out of bound 
        for(int i = 0;i <= arr.length - 2;i++){
    //because partially solving to put the index element at the correct index
           for(int j = i + 1;j > 0;j--){ 
            //swap
            if(arr[j-1] > arr[j]){
                int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
            }
//what make this algorithm more efficient than bubble sort -> no. of swaps reduced,here no need to swap if previous smaller then current .Break.            
            else{
                break;
            }
            
            }
        }
    }//practice
    static void insertion(int[] arr){
    for(int i = 0 ; i < arr.length - 1;i++){
        for(int j = i + 1;j > 0;j--){ 
            if(arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            else{
                break;
            }

        }
    }
    }
}
