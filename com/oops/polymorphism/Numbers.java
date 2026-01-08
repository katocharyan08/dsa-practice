package com.oops.polymorphism;

//method overloading
 public class Numbers{
    double sum (int a,int b){
        System.out.println("nd");
        return a + b;
    }
    double sum(double a,int b){
        System.out.println("this");
        return a + b;
    }
    int sum(int a,int b,int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        Numbers obj1 = new Numbers();
        obj1.sum(3.4,6);
    }
 }