package com.intro;

import java.util.*;

public class Armstrongnum {

    static boolean isarmstrong(int number){
        int temp = number;
        int power = String.valueOf(number).length();
        int sum = 0;      
           while(number>0){
            int rem = number%10;
             sum += (Math.pow(rem,power));
             number/=10;
           }
           return (sum==temp);

     }
    public static void main(String[] args){
        try ( Scanner in = new Scanner(System.in)){
            System.out.println("enter number");
            int num = in.nextInt();
            if (isarmstrong(num)){
                System.out.println("armstrong");
                }
            else{
                System.out.println("not armstrong");
            }
        }
    }
}
