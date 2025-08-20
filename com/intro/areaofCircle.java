package com.intro;

import java.util.Scanner;


public class areaofCircle {
    public static void main(String[] args) {
        //input radius
        try (Scanner input = new Scanner(System.in)) {
            //input radius
            System.out.print("Radius is ");
            double radius = input.nextDouble();
            
            //formula for area of circle
            double area = Math.PI * Math.pow(radius,2);
            
            System.out.println("Area of circle is " + area);
        }
    }
}
