package com.dsa.recursion;

//problem : Sum of digits of number using recursion
//Intiution : we need to separate each digit 
//Approach : use modula(%10)for remainder and divide(/10) to
//  remove each last digit with respective recursice call
//Time complexity :O(Logn) and Space complexity : O(N)

public class SumOfDigit{
    public static void main(String[] args) {
        System.out.println(func(12459, 0));
    }
    static int func(int num ,int sum){
        //basecase 
        if (num == 0){
            return sum;
        }
        int remainder = num%10;//provide remainder
        sum += remainder;
        //recursive call 1
        return func(num/10, sum);

        //recursive call 2 method
        //return (num%10) + func(num/10);
    }
}