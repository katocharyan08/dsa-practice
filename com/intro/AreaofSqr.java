package com.intro;

import java.util.Scanner;


public class AreaofSqr {
    
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){

               System.out.print("Enter number : ");

               double num  = input.nextDouble();

               double area = Math.pow(num,2);

               System.out.print("Area of square is " +area);

        }
    }
}
