
package com.intro;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter num ");
            int num = in.nextInt();

            int factorial = 1;

            for ( int i = num ; i > 0; i--) {
               // System.out.println(i);
             factorial = factorial * i;
               
            }
                System.out.println("factorial : " + factorial);
        }
    }
}
