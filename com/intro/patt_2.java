package com.intro;
import java.util.Scanner;

public class patt_2 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int sp=sc.nextInt();
            int st=sc.nextInt();
            for(int i=0;i<5;i++){
                for(int j=0;j<sp;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<st;j++){
                    System.out.print("*");
                }
                sp++;//0,1,2,3,4 space
                st--;//5,4,3,2,1 star
                System.out.println(" ");
            }
        }
    }

    }
