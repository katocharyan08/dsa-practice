package com.oops.interfaces.extendsdemo2;

public class Main implements B,A {
    @Override
    public void greet(){
        System.out.println("greeting");
    }
    public static void main(String[] args) {
        A main = new Main();
        A.greeting();
        main.fun();
    }
}
