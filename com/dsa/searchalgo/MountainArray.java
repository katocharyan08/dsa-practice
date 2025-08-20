package com.dsa.searchalgo;

public class MountainArray {
    public static void main (String[] args){
        int [] arr = {1,2,3,5,6,4,3,2};
        
        System.out.println(peakelement(arr));
    }
    static int peakelement(int[] arr){
        //binary search rules
        int start = 0 ;
        int end = arr.length - 1;
        //basecase
        if (arr.length == 0 ){
            return -1;
        }
  //mid not workig outside//mid not workig outside      
///1. mid element 
//         int mid = start + (end - start)/2;
//.loop
        while(start < end){
         //. mid element 
        int mid = start + (end - start)/2;
            //i.ascending part
            if(arr[mid] < arr[mid +1]){
                start = mid + 1;
            }
            //ii.descending part
            else {
                end = mid;
            }
            
        }
       
        return start;//at  end start and end pointing to max element 
    }
}
