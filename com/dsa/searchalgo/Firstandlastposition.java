package com.dsa.searchalgo;
import java.util.Arrays;

public class Firstandlastposition {
    public static void main(String [] args){
        int[] arr = {5,7,7,7,7,8,8,11};//sorted array
        int target = 1;
        System.out.println( Arrays.toString(position(arr,target)));
        

    }
    //find for first and last occurance of target 
    static int[] position(int[] arr ,int target ){
        int[] ans = {-1,-1};//default
        ans[0] =  search(arr,target,true);
        if(ans[0] != -1){
            ans[1] =  search(arr,target,false);
        }
        //  int start = search(arr,target,true);
        //  int end = search(arr,target,false);

        //  ans[0] = start;
        //  ans[1] = end;
        return ans;
    }
    //this functions return the index value of the target 
    static int search(int [] arr,int target,boolean findfirstindex){
        int ans = -1;
       //same logic as binary search
       int start = 0;
       int end = arr.length -1;

       while(start <= end){
          //find mid element 
          int mid = start + (end - start)/2;

          if (target < arr[mid] ){
             end = mid -1;
          }
          else if (target > arr[mid]){
            start = mid + 1;
          }
          //when target equal to mid
          else{
            //potential ans found 
            ans = mid; 
            if(findfirstindex){//for first occurance
                end = mid - 1;
            }
            else{//for last occurance
                start = mid + 1;
            }

          }
       }

      return ans;
    }

}
