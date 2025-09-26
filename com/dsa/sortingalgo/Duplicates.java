package com.dsa.sortingalgo;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {-3,-5,67,5,-5};
        System.out.println(findDuplicates(arr));
    }
   static int findDuplicates(int[] arr){  
        for(int i = 0;i <= arr.length - 2;i++){//passes
            for(int j = i+1;j > 0;j--){//counter
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                //condition check for duplicates
               else if(arr[j] == arr[j-1]){
                
                    return arr[j];
                }
                else{
                    break;
                }
                
            }
        }

        return Integer.MIN_VALUE;
    }

}

//what to do ? -> case : if multiple duplicates show error because in single array only one element should be repeated at a time, not more than one 
//why to do ? -> example : {3,3,1,2,1} (wrong)
//how to do ? ->
