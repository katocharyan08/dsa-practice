package com.dsa.array;

public class Max  {
    public static void main(String[] args) {
        int[] arr = {3,44,655,35,3664};
        System.out.println(nmax(arr));

    }   
    static int nmax(int[] arr){
        int maxval = arr[0];
        for(int i = 1;i<arr.length;i++){
            
            if(maxval<arr[i]){
                maxval = arr[i];

            }
          
        }
        return maxval;
    }  
}

