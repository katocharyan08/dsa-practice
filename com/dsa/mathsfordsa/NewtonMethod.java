//problem : Find a square root of a number using Newton Raphson method.

package com.dsa.mathsfordsa;

public class NewtonMethod {
    public static void main(String[] args) {
        double num = 40;
        System.out.println(sqrt(num));
    }
    static double sqrt(double num){
        double x = num;
        double root;
        while (true){
            root = 0.5 * (x + (num/x));
           if(Math.abs(root - x) < 1){
             break;
           } 
           x = root;
        }
        return root;
    }
}
