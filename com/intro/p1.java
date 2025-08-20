package com.intro;


import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int nSum = 0;
            int eSum = 0;
            int oSum = 0;
            
            while (true){
                int n = in.nextInt();

                if(n==0){
                    break;
                }
                if(n<0){
                    nSum += n; 
                }
                else if(n%2==0){
                    eSum += n;
                }
                else{
                    oSum += n;
                }
            }
            System.out.println("sum of neg : "+nSum);
            System.out.println("sum of even : "+eSum);
            System.out.println("sum of odd : "+oSum);
        }
}
}