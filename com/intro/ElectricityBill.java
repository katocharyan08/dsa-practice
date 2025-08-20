package com.intro;

import java.util.Scanner;

public class ElectricityBill {

    public static double calculatebill(int units){
               
            double amt ;
            double fixcharge = 5;
             
            if (units <= 100){
                amt = units * 2;
            }
            else if(units<=200){
                amt = (100 * 2) + (units - 100) * 3;
            }
            else if (units<=300){
                amt = (100*2) + (100*3) + (units-200 )*4;
            }
            else{
                amt = (100*2) + (100*3) + (100*4) + (units - 300);
                amt = amt + (fixcharge*amt)/100;
            }
   
               return amt;
        }
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter current reading : " );
            int currentreading = in.nextInt();
            System.out.println("enter previous reading : ");
            int previousreading = in.nextInt();
           
            int units = currentreading - previousreading;

            double bill = calculatebill(units); 

            System.out.println("unit consumed : "+units);
            System.out.println("bill : " +bill);

        }

    }
}
