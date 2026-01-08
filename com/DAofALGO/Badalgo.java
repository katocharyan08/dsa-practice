package com.DAofALGO;

public class Badalgo {
    public static void main(String[] args) {
        System.out.println(calculateSum());

        
    }
   static long  calculateSum(){
        long  sum = 0 ,i;
        for(i = 1;i <= 10000000000L;i++){
            sum += i;
        }
      return sum;
    }

}
