package com.dsa.recursion;

public class NumReverse {
    public static void main(String[] args) {
        System.out.println(rev(12345));
    }
    static int rev(int num){
        int digits = (int)(Math.log10(num) + 1);
      return helper(num , digits);
    }
    static int helper(int n , int digits){
        if(n%10 == n){
            return n;
        }
        return n%10 *(int) Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}

