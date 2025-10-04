package com.dsa.sortingalgo;

public class Missingnum{
    public static void main(String[] args){
        int[] arr = {4,0,1,2};
        //numbers form range 0 to n
        int i = 0 ;
        int n = arr.length;
    
        while(i < n){
             int correct_index = arr[i];
            if(arr[i] < n && arr[i] != arr[correct_index]){
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0 ;j< n;j++){
            //search 
            if(arr[j] != j){
                 System.out.println(j);
            }
            else{//if all elements are on its correct index then answer is n
                System.out.println(n);
            }
        }
    }
}