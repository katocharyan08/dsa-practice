package com.dsa.searchalgo;
//mistake in code
public class RBS{
    public static void main(String[] args) {
        int[] arr = {2,2,9,2,3,2,2};
        int target = 3;
        //System.out.println(findpivot(arr));
        System.out.println(search(arr,target));
     }
    // static int findpivot(int[] arr){
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start<=end){
    //         int mid = start + (end + start)/2;

    //         //case 1
    //         if (arr[mid] > arr[mid+1] && mid < end ){
    //             return mid;
    //         }
    //         //case 2
    //         if (arr[mid] < arr[mid-1] && mid > start){
    //             return mid - 1;
    //         }
    //         //case 3-> means all element at the right half of mid gonna be small,so no need to search in right half
    //         if(arr[start] >= arr[mid]){
    //             end = mid -1;
    //         }
    //         //case 4-> if start < mid means pivot lies in right half
    //         else{
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
    static int findpivotwithduplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end + start)/2;

            //case 1
            if (arr[mid] > arr[mid+1] && mid < end ){
                return mid;
            }
            //case 2
            if (arr[mid] < arr[mid-1] && mid > start){
                return mid - 1;
            }
           //case->if element at the start,mid,end are equal then skip dublicates
           if(arr[mid] == arr[start] && arr[mid] == arr[end]){
            if(arr[start] >  arr[start+1]){
                return start;
            }
            if(arr[end]<arr[end-1]){
                return end -1;
            }
           else if(arr[start]<arr[mid] || arr[mid] == arr[mid] && arr[mid] > arr[end]){
                //search in right 
                start = mid + 1;
            }
            else{
                end = mid -1;
            } 
            start++;
            end--;
           }
        }
        return -1;
    }
    
    static int search(int[] arr,int target){
        int pivot = findpivotwithduplicates(arr);
        if(arr[pivot] == target){
            return pivot;
        }
        if(pivot == -1 ){//than use simple binary search
           return BS(arr,target,0,arr.length-1);
        }
        if(arr[pivot] <= target){
            return BS(arr,target,0,pivot -1);
        }
        else{
            return BS(arr, target,pivot+1,arr.length-1);
        }

    }
    static int BS(int[] nums,int target,int start,int end){
       while(start<= end){
        int mid = start + (end-start)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
       } 
       return -1;
    }
}