package com.oops.staticex;
public class Staticblock {
    //inner static means doesn't depend on instance of class staticblock
    public static class Static{
       static int a=4;
       static int b;
       //it only runs once on the class loader
       static{
        System.out.println("staticblock initialise first time");
       // b = a*5;
       }
      static void fun(int nam){
            System.out.println(nam);
            System.out.println(a);
             System.out.println(b);
    }
    }
    public static void main(String[] args) {
      // Static on1 = new Static();
        //    on1.fun(455);
       //static var and method can either call by class name or object name 
        Static.fun(455);
    }
}
