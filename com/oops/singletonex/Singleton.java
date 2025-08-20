package com.oops.singletonex;

public class Singleton {
  
  //private constructor
    private Singleton(){

    }
    //declare a refrence variable
    // since this instance is  not going to depend on class object ,so it can be made static ,
    //it only return this instance internally
    private static Singleton instance;

    //method is static because if you want access with class name it will be static
    public static Singleton getinstance(){
     //check wheather for 1 object only created or not
     if(instance == null){
        instance = new Singleton();
     }
     return instance;
    }
}
