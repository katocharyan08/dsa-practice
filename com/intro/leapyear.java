package com.intro;

import java.util.Scanner;

public class leapyear{
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Enter year : ");
             int year = sc.nextInt();
             //for leap year yaer should be multiple of 4 and not of 100 and is multiple of 400
             if(year%4==0 && year%100!=0){
                 if(year%400==0){
                     System.out.println("Leap year");
                 }
                 else if(year%4!=0){
                     System.out.println("Not a leap year");
                 }
                 
             }
             else{
               System.out.println("error");
             }
         }  
     }
}