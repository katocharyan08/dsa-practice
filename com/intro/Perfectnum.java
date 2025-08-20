package com.intro;
import java.util.Scanner;

public class Perfectnum {

    static boolean isperfect(int num){
        if(num<=1){
            return false;
        }
          int sum = 0;
         int temp = num;

               for(int i = 1; i <= num/2; i++){
                
                   
                     if(num%i==0){
                       // int sum = 0;//if initialize insiden {} cannot acces outside{}
                        sum = sum + i;
                       
                     }
                    }
                    return sum == temp;
                }
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter num : ");
               int number = in.nextInt();
              
                    if (isperfect(number)){
                        System.out.println("perfect");
                    }
                    else{
                        System.out.println("not perfect");
                    }
                    }
               }
                   
                  
        }
    

