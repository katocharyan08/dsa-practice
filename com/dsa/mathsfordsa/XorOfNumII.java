package com.dsa.mathsfordsa;
//problem : find xor of the numbers in range of L to R
//intuition : First xor for (0 to R) and then remove extra by xoring with (0 to L - 1)
//approach : number % 4 gives you the xor and then xor of both function
//time complexity : O(1) and space complexity : O(1)
public class XorOfNumII {
    public static void main(String[] args) {
        int left = 3;
        int right = 4;
        int ans = xorOfRange(right) ^ xorOfRange(left - 1);
        System.out.println(ans);
    }
    static int xorOfRange(int a){
       if(a >= 0 ){ //Xor for less then 0 not work return -1
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
        }
        if(a % 4 == 2){
            return a + 1;
        }
        if(a % 4 == 3){
            return 0;
    }
}
        return -1;
    
    }
}


