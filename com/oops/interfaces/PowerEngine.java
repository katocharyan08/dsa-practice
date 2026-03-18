package com.oops.interfaces;

public class PowerEngine implements Engine {
     @Override
     public void start(){
        System.out.println("i start  power engine car");
     } 
      @Override
     public void stop() {
        System.out.println("i stop power engine car");
     }
     @Override
     public void acc() {
       System.out.println("i accelerate power engine car");
     }
}
