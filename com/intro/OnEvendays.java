package com.intro;

import java.util.Scanner;

public class OnEvendays{

    static int Evendays(int num){
           if(num==0 || num>31) { 
            return 0;
           }      
               int i = num;
               int count = 0;
               while ( i > 0){
                if(i%2==0){
                count++;
              }
                i--;                 
        }
       return count;    
       
    }
    

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter num of days in month august ");
            int month = in.nextInt();  
            if(month>0 && month<32){
              System.out.println("the num of days kunal go out wth his friend is " +Evendays(month));
            }
            else{
                System.out.println("invalid"); 
            }
           
        }
    }
}