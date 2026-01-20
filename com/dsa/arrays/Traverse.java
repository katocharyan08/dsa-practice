package com.dsa.arrays;
public class Traverse{
    public static void main (String[] args){
        int[] arr = {2,5,7,8,9};
        
        int k = 0;//initialise counter
        //using loop for traverse over an array
        while (k < arr.length){
              System.out.print(arr[k] + ",");
              k++;
        }
    }
}