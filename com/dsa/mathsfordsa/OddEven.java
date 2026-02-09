package com.dsa.mathsfordsa;
//problem : find the given number is odd or even
//intuition : check for last digit (2^0 place)
//approach : number&1 is equal to 1 considered as odd else even
public class OddEven {
    public static void main(String[] args) {
        int num = 234;
       System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
}
}
