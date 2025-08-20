package com.oops.staticex;

public class Car {
    //instance variable belongs to object of class Car
    String color ; 
    String name ;
    //static variable belongs to class Car not object ,this value common or default for every object of class Car
   static int sidemirrors ;

     //constructor
     public Car(String color , String name ){
          this.color = color;
          this.name = name;
          //static belongs to classes ,independent of object
          Car.sidemirrors = 2;
     }

     public static void main(String[] args) {
      
     
        Car c1 = new Car("blue","BMV");
        System.out.println(c1.color);
        System.out.println(c1.name);
        System.out.println(Car.sidemirrors);//value is true for all objects of class type Car so made static
        // object not require , so call it by class name
         Car c2 = new Car("green","mustang"); 
         System.out.println(c2.color);
         System.out.println(c2.name);
         System.out.println(Car.sidemirrors);

     }

}
