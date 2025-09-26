package com.intro;

import java.util.*;

public class q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            
            int rem = temp%10;
            
            rev =  rev*10 + rem;
            temp/=10;
        }
        System.out.println("reverse num : "+rev);
    }
}