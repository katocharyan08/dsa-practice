package com.intro;
import java.util.Scanner;

public class LCM{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num1 = ");
        int num1 = in.nextInt();
        System.out.print("num1 = ");
        int num2 = in.nextInt();
        int result = Math.max(num1,num2);
        while(true){
            if( result % num1 == 0 && result % num2 == 0){
                 break;
            }
            result++;
        }
        System.out.println(result);
        int gcd = (num1 * num2)/result;
        System.out.println(gcd);
        in.close();
    }
}