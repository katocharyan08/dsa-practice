package com.intro;
import java.util.Scanner;

public class q2 {
    
    public static void main(String[] args) {
           try(Scanner in = new Scanner(System.in)){
             int n1 = in.nextInt();
             int n2 = in.nextInt();
//this for loop help to print all prime no. between two no.
             for (int i = n1+1;i<n2;i++){
                //if statement is used to only ptint true once
                 if(isprime(i)){
                    System.out.print(i + " ");
                }
             }
    }
    
}
      static boolean isprime( int num){
        //logic
         if (num==1 || num==0){
            return true;
         }
         
        
        int c = 2;
        while(c*c<=num){
          int rem = num%c;
          if(rem==0){
            return false;
          }
          c++;
        }
        int sqr = c*c;
        return sqr>num;//if num = 36 and c = 7 ,means c*c=49,means 49>36.means c toh 7 tabhi hua 
        //jab pichli values divisible nhi thi.So this mean return true.

      }
}