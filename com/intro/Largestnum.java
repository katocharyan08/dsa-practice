package com.intro;
import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

           
               
        int Max = Integer.MIN_VALUE;
        int[] arr = {2,4,56,7,8,9,-777,6676,6,445};
        
        for(int element : arr){
            if(element > Max){
               Max = element; 
            }
        }
        System.out.println(Max);
        //System.out.println("enter 0 to stop");
            
        /*     while (true){
                   
                num = in.nextDouble();

                if (num > Max){
                    Max = num;

                }
                if(num == 0){
                    break;
                }
            }
              
            if(Max == Double.MIN_VALUE){
                System.out.println(" No num enter");
            }

            else{
                 System.out.println("largest num is "+ Max);
            }

        }*/

            // while( num != 0){

               
            //     if( num > Max){
                
            //            Max = num;


            //     }
            //      System.out.println(Max);
            //      break;

            // }
               
              
















    }
 }
}
