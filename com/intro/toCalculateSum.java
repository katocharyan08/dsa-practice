package com.intro;
//import java.util.Scanner;

public class toCalculateSum{

  /*   public static void main(String[] args) {

        int ans=sum1();
        System.out.println("the answer is "+ans);
        
    }
    static int sum1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1 :");
        int num1= in.nextInt();
        System.out.print("Enter no. 2 :");
        int num2= in.nextInt();
        int sum=num1 + num2;
        in.close();

        return sum;
        */
   
        //pass th value of no.'s when the function is called in main() method
    public static void main(String[] args) {
        int ans=sum2(34,56);
        System.out.println("the ans is : "+ans);
    }
    static int sum2(int a , int b){
       int sum = a+b;
       return sum; 
    }
}