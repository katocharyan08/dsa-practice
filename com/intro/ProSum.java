package com.intro;
import java.util.Scanner;

public class ProSum { public static void main(String[] args) {
    
  try( Scanner in = new Scanner(System.in)){
  
     System.out.println("Enter number");

    int num = in.nextInt();
    int pro = 1;
    int sum = 0;

    while( num > 0){
        int rem = num % 10;//provide remender

       num = num/10;

       sum += rem;

       pro *= rem;
          
    }
    int result = pro - sum;
  System.out.println( "the diff is "+ result);




    }

}
}
