package com.intro;

import java.util.Scanner;

public class isPrime {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("enter num : ");
      int num = in.nextInt();

      boolean isPrime = true;

      // basecase
      if (num <= 1) {
         isPrime = false;// because we don't need to check for these two
      } else {
         int i = 2;
         while (i * i <= num) {
            if (num % i == 0) {
               isPrime = false;
               break;
            }
            i++;
         }
      }
      if(isPrime == true){
         System.out.println("num is prime");
      }
      else{
         System.out.println("num is not prime");
      }
      in.close();
   }
}
