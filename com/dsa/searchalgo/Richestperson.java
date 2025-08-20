//package dsa.searchalgo;
package com.dsa.searchalgo;
public class Richestperson {
    public static void main(String[] args){
        int [][] accounts = {
               {1,2,3},
               {3,2,1},
        };
        System.out.println(findmaxWealth(accounts));
    }
    static int findmaxWealth(int[][] accounts){
        //iterate row
        int max = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int rowsum = 0;
            //col
            for(int elem : ints){
                rowsum += elem;
            }
            //compare which person has most wealth
            if(rowsum > max){
               max = rowsum;
            }
        }
        return max;
    }
}
