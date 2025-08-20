package com.intro;

import  java.util.Scanner;


public class Convert {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter rupee : ");
        int rupee = input.nextInt();
        float conrate = 74.64f;
        float dollor = rupee/conrate;

        System.out.println(rupee + " rupee is equal to "  + dollor);
    
        input.close();
    }

}
