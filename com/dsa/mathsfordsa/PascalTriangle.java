package com.dsa.mathsfordsa;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(sumOfNthRow(4));
    }
    //for long n can be range between 0 to 63 bit
   public static long sumOfNthRow(int n){
        return 1L << (n-1);//it  give the 2^n-1 which let us give the sum of that row while 
        // itself travelling through each row and stops at n-1 
    }
}
