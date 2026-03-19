package com.oops.interfaces.extendsdemo2;

public interface A {
    static void greeting(){
        System.out.println(" greeting through static method");
    }
   default void fun(){
    System.out.println("i am fun");
  }
}
