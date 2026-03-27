//problem : find all number that divide a given number

package com.dsa.mathsfordsa;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        int num = 20;
        factors1(num);
    }
    //method 1 - brute force
      static void factors(int num){
        for(int i = 1;i <= num;i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
      }
      //method 2 - optimal way
      static void factors1(int num){
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 1;i*i<= num;i++){
            if(num % i == 0){
                if(num / i == i){
                    System.out.print(i+ " ");
            }
            else{
                System.out.print(i + " " );
                list.add(num/i);
            }
        }
      }
      for(int i = list.size() - 1; i >= 0; i--){
        System.out.print(list.get(i)+ " ");
      }
}
}
