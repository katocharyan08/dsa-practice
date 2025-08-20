package com.oops;

public class constructor {
    public static void main(String[] args) {
    //   Car car2 = new Car();
    //   System.out.println("call one constructor from other constructor");
    //         System.out.println(car2.name);
    //         System.out.println(car2.color);
    //         System.out.println(car2.torque);

      //2
       Car car1 = new Car("bmv","blue",450);
       System.out.println("para constructor");
            System.out.println(car1.name);
            System.out.println(car1.color);
            System.out.println(car1.torque);
      //3
      System.out.println("copy constructor");
     Car random = new Car(car1);
            System.out.println(random.name);
            System.out.println(random.color);
            System.out.println(random.torque);
  
    }
}

class Car{
    String name ;
    String color ;
    int torque ;
    
    //1 constructor
    Car(){
    //    this.name = "BWM";  
    //    this.color = "grey";
    //    this.torque = 200;

    // calling other constructor from one constructor
    //using this keyword
       this("ferrari","red",300);
    }
     
    //2 constructor parameterized 

    Car(String name ,String color,int torque){
       this.name = name;   
       this.color = color;
       this.torque = torque; 
    }

    //3 copy constructor
    // We can create our own by writing a constructor that takes
    // an object of the same class as a parameter and copies its fields.
    Car(Car other){
        //other is object refrence like car1
        this.name = other.name ;
        this.color = other.name;
        this.torque = other.torque;
    }
}



