package com.oops.interfaces;

public class Main {
   public static void main(String[] args) {
       Engine car = new Car();
      // System.out.println(car.rain); 
       car.start();
       car.acc();
      // car.brake();
       car.stop(); 

       Media carMedia = new Car();
       carMedia.start();//problem
   }
}
