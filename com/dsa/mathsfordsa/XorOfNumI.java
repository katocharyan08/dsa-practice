package com.dsa.mathsfordsa;
import java.util.Scanner;
//problem : find xor of the numbers in range of 0 to a
//intuition : find xor for a = 1,2,3,4,5,...... .This will help you get a sequence.
//approach : number % 4 gives you the xor
//time complexity : O(1) and space complexity : O(1)
public class XorOfNumI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        int num = sc.nextInt();
       System.out.println(xorOfRange(num));
       sc.close();
    }
    static int xorOfRange(int a){
       if(a >= 0 ){ //Xor for less then 0 not work return -1
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
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
