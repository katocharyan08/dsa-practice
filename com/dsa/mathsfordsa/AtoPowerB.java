package com.dsa.mathsfordsa;
//problem : calculate the power of base b
//time complexity : O(logN) and space complexity : o(1)
public class AtoPowerB {
    public static void main(String[] args) {
        int base = 3;
        int power = 4;
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            base = base * base;
            power >>=1;
        }
        System.out.println(ans);
    }
}
