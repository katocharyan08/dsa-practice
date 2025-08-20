package com.dsa.searchalgo;
public class InfiniteArray{
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9,13,16,19,28,37,57,95,176,268,689};
        int target = 4;
        System.out.println(findRange(arr,target));
    }
    //this method is helpss in finding bounds 
    static int findRange(int[] arr, int target){
        //initaially indices
        int start = 0;
        int end = 1;

        //loop conditions for target in range 
        while(target > arr[end]){
            //double the size of box 
            int temp  = end + 1;//making temp bcoz initial start value going to be used 
            //formula newend = ( previous end ) + sizeofbox*2;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[]arr , int target , int start ,int end){
        while(start <= end){
            //find mid element
            int mid = start + (end - start)/2;

            //conditins
            if(target < arr[mid]){
                //target small , search in left
                end = mid - 1;
            }
            else if(target > arr[mid]){
                //search right 
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        //target not present 
        return -1;
    }
}