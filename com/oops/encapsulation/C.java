package com.oops.encapsulation;

public class C extends A {
   public static void main(String[] args) {
     A obj = new A();
   //  System.out.println(obj.temp);
     System.out.println(obj.demo);
     System.out.println(obj.cap);
     System.out.println(obj.or);
     C ob = new C();
   //  System.out.println(ob.temp);
     System.out.println(ob.demo);
     System.out.println(ob.cap);
     System.out.println(ob.or);
     
     A obb = new C();
    // System.out.println(obb.temp);
     System.out.println(obb.demo);
     System.out.println(obb.cap);
     System.out.println(obb.or);
    
    // C oob = new A(); -> access control is checked by reference type
   } 
}
