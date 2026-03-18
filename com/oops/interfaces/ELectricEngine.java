package com.oops.interfaces;

public class ELectricEngine implements Engine {
      @Override
     public void start(){
        System.out.println("i start electric car");
     } 
      @Override
     public void stop() {
        System.out.println("i stop electric car");
     }
        @Override
     public void acc() {
       System.out.println("i accelerate electric car");
     }
}
