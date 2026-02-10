package com.patternwisesolving.twopointer;
//problem : find all zeros and move them at last after a non zero number in an array
//intuition : perform swap using slow fast pointer approach
//approach : fast pointer scans for non-zero number and swap it with slow
//time complexity : O(n) and space complexity ; O(1)
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {2,7,0,8,2,0,1};
         rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int[] arr){
        int slow = 0;
        //loop for stop fast pointer at last 
        for(int fast = 0;fast < arr.length; fast++){
            //slow pointer moves by 1 with condition check 
            //fast -> scan for non zero number
            if(arr[fast] != 0){
                //swap it with slow
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                slow++;
            } 
        }
    }
}
