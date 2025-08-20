
package com.intro;
import java.util.Scanner;

public class primenum {

    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter num : ");
               int num = sc.nextInt();
               int c = 2;

               while(c*c<=num){ // sqr root bcoz repetation start
                   if(num%c ==0){
                    System.out.println("not prime number");
                     break;
                   }
                   c=c+1;
                 
               }
               
               System.out.println("prime number");
         }  
    }
}


