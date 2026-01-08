package com.intro;
//sum of n numbers
public class RecrSum {
    public static void main(String[] args) {
       int num = 2; 
       System.out.println(sum(num));
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
