package com.intro;
import java.util.Scanner;
public class Reversenum {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
       System.out.println("enter string");
            String str = in.nextLine();
            String reversestr ="";
            
            for(int i = str.length() - 1; i >=0 ; i--){
                reversestr += str.charAt(i);
            }
            System.out.println("reverse : "+reversestr);
        }
    }
}
