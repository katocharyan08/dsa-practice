package com.intro;
import java.util.Scanner;
 
public class q1 {
    public static void main(String[] args) {
      try(Scanner in = new Scanner(System.in)){
        
        System.out.print("enter marks : ");
        int marks = in.nextInt();
        grade(marks);

    }
    }
       static void grade(int marks){

                
                 if( marks<=100 && marks>=91){
                   System.out.println("student got AA grade ");
                }
                else if(marks <= 90 && marks>=81){
                    System.out.println("student got AB grade ");
                }
                else if( marks <= 80 && marks>=71){
                    System.out.println("student got BB grade ");
                }
                else if(marks <= 70 && marks>=61){
                    System.out.println("student got BC grade ");
                }
                else if(marks <= 60 && marks>=51){
                    System.out.println("student got CD grade ");
                }
                else if(marks <= 50 && marks>=41){
                    System.out.println("student got DD grade ");
                }
                else if ( marks <= 40 && marks>=0){
                      System.out.println("Fail");
                }
                else{
                    System.out.println("invalid");
                }
            
       } 
    
    }   




