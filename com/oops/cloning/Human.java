package com.oops.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    Human(){
        this.age = 23;
        this.name = "Aryan";
        
    }
    Human(int age ,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4};
    }
    Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Human h3 = (Human)super.clone();//shallow copy
        //deep copy
        h3.arr = new int[h3.arr.length];
        for(int i = 0;i < h3.arr.length;i++){
            h3.arr[i] = this.arr[i];
        }
        return h3;
    }
}
