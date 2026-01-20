package com.dsa.arrays;
// find weather an array is sorted or not..
public class p_3_O{
    public static void main (String[] args){
     boolean isSorted  = true;//default true   
        int[] array = {23,74,88,893,145};
        for(int i=0;i<array.length-1;i++){
          if(array[i] > array[i+1]){
            isSorted=false;
            break;
        }
        
    }
    if(isSorted){//true by default
        System.out.println("the array is sorted");
    }
    else{//false after traverse on for loop
        System.out.println("the array is not sorted");
    }

    }
}
