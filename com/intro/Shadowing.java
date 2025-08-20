//Shadowing is only done with class variables , not in methods
package com.intro;
public class Shadowing {
    
       //int a = 12;//this is obj dependent
      static int a = 10;// made static because you can,t use obj dependent thing in main fn(obj indep.)
      public static void main(String[] args) {
        System.out.println(a);
       // int a;//declare
        a = 20;//initialize

        //the class vriable is shadowed by low level variable when low level var is initialsie,not when declare

        System.out.println(a);
      }
    
}
