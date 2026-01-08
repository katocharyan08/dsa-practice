package com.intro;

public class TrailingZeroFact {
    public static void main(String[] args) {
       int num = 200;
       System.out.println(trailingZeros(num)); 
    }
    static int trailingZeros(int n){
        //basecase
        if(n < 0){
            return -1;
        }
        int count = 0;
        for(int i = 5;i <= n; i = i*5){
             count = count + n/i;
        }
        return count;
    }
}
