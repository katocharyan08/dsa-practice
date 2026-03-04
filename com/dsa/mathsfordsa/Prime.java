package com.dsa.mathsfordsa;

public class Prime {
    public static void main(String[] args) {
        int num = 20;
        for(int i = 2;i*i <= num;i++){
           System.out.println(i + " " + isPrime(i)); 
        }
    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2;i*i <= num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
