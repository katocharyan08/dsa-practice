package com.oops.abstraction;

abstract class TV {
    //abstract method wtihout body
    abstract void turnOn();
    abstract void turnOff();
}
//Concrete class implementing the abstract methods
 class TVRemote extends TV{
    //providing the body to abstract methods
    @Override
    void turnOn(){
        System.out.println("Turn on the TV");
    }
    @Override
    void turnOff(){        
        System.out.println("turn off tv");
    }
}
//Main class to demonstrate the abstracion
public class Main{
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
