package com.dsa.hashing;

import java.util.Scanner;

public class NumbersCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter array size");
        int n = in.nextInt();
        System.out.println("Input array");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        countFreq(arr,n,in);
    in.close();

    }
    static void countFreq(int[] arr, int n, Scanner in){
        //pre-storing or pre-computing
        int[] hash_array = new int[13];
        for(int i = 0; i<n; i++){
            hash_array[arr[i]]++;
        }
        //quries
        System.out.println("enter q");
        int q = in.nextInt();
        System.out.println("enter numbers");
        while(q>0){
            int number = in.nextInt();
            //fetch
            System.out.println(hash_array[number]);
            q--;
        }
    }
}
