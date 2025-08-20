package com.dsa.searchalgo;

public class Findmin {
    public static void main(String[] args) {
      int[] nums = {45787,77644,88,-66,-33356,-56474,3465,356,325425,77687};  
      System.out.println(min(nums));
    }
    //made int bcoz it gonna return value
    static int min(int[] arr){
        //basecase 
        if (arr.length == 0 ){
            return 0;
        }
        //logic -> foreach is used to travel over all element present in the array 
        int Min = Integer.MAX_VALUE;//Default value is maxx
        for(int element : arr){
            if (element < Min){
                Min = element;
            }
        }
        return  Min;
    }
}
