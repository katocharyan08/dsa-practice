//All ASCII character and ASCII character starts from 0 to 255
package com.dsa.hashing;
import java.util.Scanner;
public class AllAscii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter len : ");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.println("input array");
        for(int i = 0; i < n; i++){
            arr[i] = in.next().charAt(0);
        }
        countFreq(arr, n, in);
        in.close();      
    }
    static void countFreq(char[] arr,int n, Scanner in){
        int[] hash_array = new int[256];
        //pre-computing
        for(int i = 0; i < n ; i++){
            hash_array[arr[i]]++;
        }
        System.out.println("enter query");
        int q = in.nextInt();
        while(q > 0){
            char ch = in.next().charAt(0);
            //fetch 
            System.out.println(hash_array[ch]);
            q--;
        }
    }
}
