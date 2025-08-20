package com.intro;

import java.util.Scanner;

public class CSAofcylinder {

    public static void main(String[] args) {
        
      /*   try(Scanner input = new Scanner(System.in)){

            System.out.print("Enter radius : ");

            double r = input.nextDouble();

            System.out.print("Enter Height : ");

            double h = input.nextDouble();

            System.out.print("C.S.A of Cylinder is " );

            double CSA =  (2 * Math.PI * r * h );

            System.out.println(" "+CSA);
        } */
              
         //total surface area of cylinder


        try(Scanner in = new  Scanner(System.in)){

           double r = in.nextDouble();
           double h = in.nextDouble();
           double tsa = ( 2 * Math.PI * r * ( r + h));

           System.out.println("TSA of Cylinder is "+tsa);

        }
    }
}

