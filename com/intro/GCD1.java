package com.intro;
import java.util.Scanner;

public class GCD1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = in.nextInt();
         System.out.print("enter num2 : ");
        int num2 = in.nextInt();
        //base case
        if(num1==num2){
            System.out.println(num1);
        }
        if(num1 == 0){
            System.out.println(num2);
        }
        if(num2 == 0){
            System.out.println(num1);
        }
        //to find minimum num
      int k = min(num1,num2);
      int gcd = 1;
      for(int i = 1;i <= k;i++){
        if(num1 % i == 0 && num2 % i == 0){
             gcd = i ;
        }
      }
      System.out.println("Greatest common divisor is " + gcd);
      in.close();
    }
    static int min(int a,int b){
        if(a < b){
            return a;
        }
      return b;
    }
}
