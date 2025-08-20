package com.intro;
import java.util.Scanner;

public class NCRandNPR {

    static int factorial( int number){

        if(number==0||number==1){
            return 1;
        }
           
        int temp = number;
        int fact = 1;

        

        for(int i=1;i<=number;i++){
            fact *= temp;
            temp--;
        }
    
    return (fact);
 }


    public static void main(String[] args) {
        try(Scanner in = new  Scanner(System.in)){
             System.out.println("enter n :");
              int n = in.nextInt();
             System.out.println("enter r :");  
              int r = in.nextInt();
              int z = ( n - r);
            if(r<0||r>n){
               System.out.println("invalid");
            }
            else{
              double ncr = factorial(n)/(factorial(r) * factorial(z));
              System.out.println("NCR : "+ncr);
            
              double npr = factorial(n)/(factorial(z));
               System.out.println("NPR : "+npr);
            }
        }
    }
}
