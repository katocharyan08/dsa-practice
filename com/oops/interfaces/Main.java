package com.oops.interfaces;

public class Main {
   public static void main(String[] args) {
    //    Engine car = new Car();
    //   // System.out.println(car.rain); 
    //    car.start();
    //    car.acc();
    //   // car.brake();
    //    car.stop(); 

    //    Media carMedia = new Car();
    //    carMedia.start();//problem
    
//Default    
    NiceCar car = new NiceCar();
//parameterized    
    //NiceCar car1 = new NiceCar(new PowerEngine());
    //NiceCar car2 = new NiceCar(new ELectricEngine());


            car.start();
            car.stop();
            car.startMusic();
            car.stopMusic();
            car.upgradeEngine();
            car.start();
            car.stop();
            
   }
}
