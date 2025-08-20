package com.intro;

import java.util.Scanner;


public class HCFandLCM {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter num");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int on1 = num1;
        int on2 = num2;

        

        
         
        while(num1 % num2 != 0){
              int c = num1 % num2;
              num1 = num2;
              num2 = c;
        }
       int hcf = num2;
       System.out.println(hcf);
//we using on1 and on2 because num1 and num2 value has been changed and inn this 
//formula we require original values
              
    int lcm = (on1 * on2)/hcf;

    System.out.println(lcm);
         
        
    }
}
}
 