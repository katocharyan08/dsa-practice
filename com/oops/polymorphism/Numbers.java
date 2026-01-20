package com.oops.polymorphism;

//method overloading
 public class Numbers{
    double sum (int a,int b){
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
        System.out.println(obj1.sum(33.7,6));
        
    }
 }

