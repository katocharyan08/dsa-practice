package com.oops.encapsulation;

public class B  {
    public static void main(String[] args) {
        A obj = new A();
        //private -> not accessable directly ,need getter-setter method
       // System.out.println(obj.temp); 
        obj.setTemp(3);
        System.out.println(obj.getTemp());
        //public -> all acces
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
