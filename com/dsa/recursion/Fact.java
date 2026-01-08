package com.dsa.recursion;

public class Fact {
    public static void main(String[] args){
     int n = 3;
     System.out.println(fact(n));
    }
    static int fact(int num){
        if(num == 1 || num == 0){
           return 1;
        }
        
        return num * fact(num - 1);
    } 
}
