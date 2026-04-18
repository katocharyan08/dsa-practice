package com.dsa.recursion;

public class CountZeros{
    public static void main(String[] args) {
       System.out.println(countZero(302004)); 
    }
    static int countZero(int num){
        return helper(num , 0);
    }
    static int helper(int n , int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10,count);
    }
}