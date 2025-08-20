package com.dsa.searchalgo;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-45,-34,-22,-10,-5,-2,0,1,4,7,13,25,36,44};
        int target = 33;
        int ans = orderagnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderagnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the given arr is ascending or descending
        boolean isAsc ;
        isAsc = arr[start] < arr[end]; //when ascending ,if the starting element is less than end elemenet
        // or more optimise way 
        //boolean isAsc = arr[start] < arr[end];
       
        while (start <= end){//this while condition till starting index cross end index 

            //find mid element 
            int mid = start + (end - start)/2;

        //this condition same for both asce and desc
          if (target == arr[mid]){
            return arr[mid];
          }

         //these condition decide whether the given array is asce or desc 
            if(isAsc){
                if(target >arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
          
           else{ 
             if(target < arr[mid] ){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        }
        return -1;
    }
}