package com.oops;

public class Demo {
    int legs = 2;
    int hands = 2;
    Integer leg = 67;
    //constructors
    // Demo(){
    //     this.legs = 3;
    //     this.hands = 5;
    // }
    Demo(){
        this(4,3);
    }
    Demo(int l , int h){
        //this.legs = legs ,//this upoints to crruent object ,it diff b/w local and instance variable
         legs = l;
         hands = h;
    }
    Demo(Demo obj){
        this.legs = obj.legs;
        this.hands = obj.hands;
    }
    
    public static void main(String[] args) {
        
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(4,6);
         System.out.println(obj1.legs);
        System.out.println(obj2.legs);
        Demo obj3 = new Demo(obj2);
        System.out.println(obj3.hands);


        //Wrapper class
         Integer num = 34;//it is created as object
         
        
    }
}
