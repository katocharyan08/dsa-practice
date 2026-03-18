package com.oops.interfaces;

public class CDPlayer implements Media {
     @Override
     public void start(){
        System.out.println("i start audio player");
     }  
      @Override
     public void stop() {
        System.out.println("i stop audio player");
     }
}
