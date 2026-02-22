package com.oops.singletonex;

import com.oops.encapsulation.A;

public class C {
    public static void main(String[] args) {
//in different package we import package where class A exist ,here we only access public data members
//  but data member with default,private and protected not access directly only through getter-setter method.

          A obj = new A();
        //private 
        System.out.println(obj.temp); 
        obj.setTemp(3);
        System.out.println(obj.getTemp());
        //public 
        System.out.println(obj.cap);
        obj.setCap(7);
        System.out.println(obj.getCap());
        //no access specifier
        System.out.println(obj.demo);
        obj.setDemo(5);
        System.out.println(obj.getDemo());
        //protected
        System.out.println(obj.or);
        obj.setOr(8);
        System.out.println(obj.getOr());
    
    }
}
