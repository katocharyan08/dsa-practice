package com.intro;

import java.util.*;

public class q4{
    public static void main(String[] args){
       
     Scanner sc = new Scanner(System.in);
     System.out.print("input : " );
     int n = sc.nextInt();
     if(n == 1){
        System.out.println("output : "+ 6);
     }
     else if(n == 2){
        System.out.println("output : "+ 5);
     }
      else if(n == 3){
        System.out.println("output : "+ 4);
     }
      else if(n == 4){
        System.out.println("output : "+ 3);
     }
      else if(n == 5){
        System.out.println("output : "+ 2);
     }
    else if(n == 6){
        System.out.println("output : "+ 1);
     }
     else{
        System.out.println("error");
     }
     
    }
}