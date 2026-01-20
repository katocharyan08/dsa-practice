package com.dsa.mathsfordsa;
//Problem : find unique element from array with duplicate element.
//Approach : Using Xor operator because A^A = 0(means duplicate going to be discard)
//Note : order dosen't matter for XOR operation on element.
//Time complexity : O(N) and Space complexity : O(1)
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,4,7,3,5,7,2,4,3};
        System.out.println(ans(arr));
    }

     static int ans(int[] arr) {
        int unique = 0;
        //for ech loop to trverse element of array
        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }
}
