package com.dsa.recursion;
//problem : Fibonacci series using recursion
//Intiution : sum of previous two term is eqaual to the next term
//Why recursion : simple code and breaks complex program itnto simple
//Time complexity : O(2^n){exponential} & Space complexity : O(N){due to linear recursive calls}

public class Fibo {
    public static void main(String[] args) {
       System.out.println(fibo(10));
    }
    static int fibo(int n){
        //basecase1
        if (n==0){
            return 0;
        }
        //basecase2
        if (n==1){
            return 1;
        }
        //recurrence relation
        return fibo(n - 1) + fibo(n - 2);
    }
   
}
