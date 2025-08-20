package com.intro;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
        System.out.print("Table of " );
           int num=sc.nextInt();
           int n = 1;
           while(n<=10){
            int tab = n*num;
             System.out.println(tab);
             n++;
           }

      }  
    }
}
