package com.intro;
import java.util.Scanner;

public class isPrime{
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("enter num : ");
      int num = in.nextInt();
      //basecase
   if(num == 0 && num == 1){
      
   }
      
      for(int i = 2;i*i <= num;i++){
       //basecase
         if(i == 0 && i ==1){
              continue;//because we don't need to check for these two
      }
        else if(num % i == 0){
           System.out.println("not prime ");
           break;
         }
         else{
            System.out.println("the given num is prime");
            break;
         }
      }
      in.close();
   }
}