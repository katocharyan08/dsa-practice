package com.intro;
import java.util.Scanner;

public class Average{
    static double Avg( int number){

        int temp = number;
        
        if(temp==0){
                return 0;
            }

        double ans = 0;
        int i = 1;

        while ( i<=temp){ 

            ans = (ans + i);
              i++;
        }
        System.out.println( ans);
        double result = ans /temp;
        System.out.println( result);
        return result;
    }

public static void main(String[] args){
      try (Scanner in = new Scanner(System.in)){
        System.out.println("enter num : ");
        int num = in.nextInt();
         
        double avg = Avg(num);
        System.out.println("average of n numbers : "+avg);
      }
}
}
