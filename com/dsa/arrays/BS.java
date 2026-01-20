package com.dsa.arrays;

public class BS {
    public static int main(String[] args) {
        int[] arr = {12,44,666,890,3367};
        int target = 666;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
