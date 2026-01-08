package com.DAofALGO;

public class Goodaldgo {
    public static void main(String[] args) {
        long n = 10000000000L;
        System.out.println(calculateSum(n));
    }
    static long calculateSum(long n){
        return (n*(n+1)/2);
    }
}
