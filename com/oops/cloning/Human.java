package com.oops.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    Human(){
        this.age = 23;
        this.name = "Aryan";
    }
    Human(int age ,String name){
        this.age = age;
        this.name = name;
    }
    Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
