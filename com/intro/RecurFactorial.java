package com.intro;

public class RecurFactorial {
    public static void main(String[] args) {
      int num = 6;
      System.out.println("fact of "+num+" is "+fact(num));
    }
    static int fact(int n){
        //basecase
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }    
}
