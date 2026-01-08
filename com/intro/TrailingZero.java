package com.intro;
import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num : ");
        int num = in.nextInt();
        int count = 0 ;
        while(num > 0){
           int rem = num % 10;
           if(rem == 0){
            count++;
           }
          num = num/10;
        }
        System.out.println(count);
        in.close();
    }
}
