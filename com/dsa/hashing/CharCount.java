//for lowercase only

package com.dsa.hashing;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter length : ");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.println("Input array : ");
        for(int i = 0; i < n;i++){
            arr[i] = in.next().charAt(0);
        }
        countFreq(arr,n,in);
        in.close();
    }
    static void countFreq(char[] arr, int n, Scanner in){
        //pre-computing
        int[] hash_array = new int[26];
        for(int i = 0; i < n; i++){
            //typecasting
            hash_array[arr[i] - 'a']++;
        }
        //queries
        System.out.println("Query");
        int q = in.nextInt();
        System.out.println("Enter Char ");
        while(q > 0){
            char ch = in.next().charAt(0);
            //fetch
            System.out.println(hash_array[ch-'a']);
            q--;
        }
    }
}
