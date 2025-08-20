package com.intro;

import java.util.Scanner;

public class AofIsosceles {

    public static void main(String[] args) {
 
        try(Scanner input = new Scanner(System.in)){
        
            System.out.print("Base = ");
        
            double base = input.nextDouble();
        
            System.out.print("Height = "); 
        
            double height = input.nextDouble();
        
            double area = ( 0.5 * base * height );
 
            System.out.println("Area of isosceles triangle is "+area);
        }
    }   
}
