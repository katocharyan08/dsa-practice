package com.intro;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter x : ");
              int x = sc.nextInt();
             
              System.out.println("enter numbers : ");
              int num = sc.nextInt();
              int sum=0;
              for ( int i = num; i < x ; i++ ){
                   sum = sum + num; 
                   num++;
              }
            
              System.out.println(sum);

              
              }
             }
                
            }

          

