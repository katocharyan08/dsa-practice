// get a number from user and print wheather it is positive or negative?
package com.intro;
import java.util.Scanner;
public class ifelse{
public static void main(String[] args){
 System.out.print("enter the integer:\n");
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
if(num<0){
    System.out.println("Number is negative");
}
else if(0<num){
    System.out.println("Number is positive");
}
else{
    System.out.println("neutral");
}
sc.close();
}
}