package com.intro;

import java.util.Scanner;


public class Palidrome{


static boolean ispalidrome( int number){
    int ans = 0;

    int temp = number;
     
    while(number>0){
        
        int rem = number % 10;
        ans = (ans * 10) + rem;
        
        number /= 10;


    }
   
   System.out.println(ans);
    return ans==temp;
}

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter num : ");
            int num = in.nextInt();
            if(ispalidrome(num) == true){
                System.out.println(" it is palidrome");
            }
            else{
                System.out.println("not palidrome");
            }
        
            }
    }
}
