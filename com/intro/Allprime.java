  //Given a number n,find all prime numbers less than or equal to n.

package com.intro;
import java.util.Scanner;
public class Allprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num : ");
         int num = in.nextInt();//n value changing after finding each prime number
         primeNum(num);
        
        in.close();
    } 
static void primeNum(int n){
  for(int i = 2;i <= n;i++){
    if(isPrime(i)){
       System.out.print(i +",");
    }
  }
}
static boolean isPrime(int num){
   //corner case
         if(num <= 1){
          return false;
         }else{
          int i = 2;
          while(num >= i*i){
            if(num%i == 0){        
              return false;
            }
            i++; 
          }
}
return true;
}
}
