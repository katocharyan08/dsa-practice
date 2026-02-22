package com.dsa.tdarray;

import java.util.Arrays;

//Arrays.toString(arr) it accept single array but not int only
//row wise traversal
public class RowWise {
    public static void main(String[] args) {
        int[][] arr = {{12,34,55,85},//arr -> is type : int[][]
                       {74,29,4},
                        {71,22}
                      };

            for(int row = 0; row < arr.length; row++){//arr[row] is type : int[]
                for(int col = 0; col < arr[row].length; col++){
                    System.out.print(arr[row][col] + " , ");//arr[row][col] -> is type : int
                }
                System.out.println();
            }
            System.out.println(Arrays.toString(arr));//print hascode beacause each index itself is an array
            System.out.println(Arrays.deepToString(arr));//this is the method
   }
}
