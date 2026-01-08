package com.intro;
import java.util.Scanner;

public class GCD2 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("enter num1 : ");
        int num1 = in.nextInt();
         System.out.print("enter num2 : ");
        int num2 = in.nextInt();
        int on1 = num1;
        int on2 = num2;
        //basecase  
        if(num1 == 0){
            System.out.println("gcd of num : "+num2);
        }
        if(num2 == 0){
            System.out.println("gcd of num : "+num1);
        }
        while(num1 != num2) {
            if(num1 < num2){
                num2 = num2 - num1;
            }
            if(num1 > num2){
                num1 = num1 - num2; 
            }
        }
        System.out.println("gcd of num : "+ num1);
        int lcm = (on1*on2)/num1;
        System.out.println(lcm);
        in.close();
   }    
}
