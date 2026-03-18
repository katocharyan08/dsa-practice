package com.oops.interfaces;

public class Car implements Engine,Brake,Media{
    int rain = 89;
     @Override
     public void start(){
        System.out.println("i start engine like a normal car");
     }     
     @Override
     public void brake(){
        System.out.println("i brake like a normal car");
     }
     @Override
     public void stop() {
        System.out.println("i stop engine like a normal car");
     }
     @Override
     public void acc() {
       System.out.println("i accelerate like a normal car");
     }
}
