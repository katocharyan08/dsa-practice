package com.dsa.mathsfordsa;

public class NoOfDigits {
   public static void main(String[] args) {
    int num = 424;
    int base = 2;
    //1st way right shift number and count
    // 2nd way formula to find number of digits in base b
    int ans = (int)(Math.log(num)/Math.log(base)) + 1;

      System.out.println(ans);
   } 
}
