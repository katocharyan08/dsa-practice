package com.oops.staticex;
public class Human { 
    int age;
    String name;
    static int bones = 206;
    static long pop ;


     public Human(int age , String naam ){
        this.age = age;
        this.name = naam;
        //static call by class
        Human.bones = 206;
        Human.pop +=1;

     }
    
}
