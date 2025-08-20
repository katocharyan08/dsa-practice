package com.dsa.searchalgo;

import java.util.*;

//search element in 2d array

public class Searchfor2d {
public static void main(String[] args) {
    int[][] arr = {
        {45,65,87},
        {23,17},
        {60,98,43,72}
                     };
     int target = 98;

     int[] ans = toSearch(arr, target);//format for return value {row , col}
        System.out.println(Arrays.toString(ans));

    System.out.println(max(arr));


}
//int[] made for returning 1 arr
static int[] toSearch(int[][] arr,int target){
     
    for ( int row = 0; row < arr.length; row++){
         for ( int col= 0; col < arr[row].length; col++){
                 if (arr[row][col] == target){
                    return new int[]{row,col};
                 }
    }

}  
  
    
    //if not
    return new int[]{-1,-1};
      
}
// to max in 2d array
static int max(int[][] arr){
    int Max = Integer.MIN_VALUE;
    for (int[] num : arr) {
        for(int element : num){
              if (element > Max){
                Max = element;
              }
        }

    }

  return Max;
    }

}