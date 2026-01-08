package com.intro;
import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num : ");
        int num = in.nextInt();
        int result = 1;      
        for(int i = num;i > 0;i--){
            if(i == 0 || i == 1){
                break;
            }
            else{
            result = result * i;
            }
        }
        System.out.print("factorial of num is : " +result);
     in.close();
    }
}
