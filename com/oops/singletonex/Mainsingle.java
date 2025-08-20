package com.oops.singletonex;

public class Mainsingle {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getinstance();

        Singleton obj2 = Singleton.getinstance();
        
        Singleton obj3 = Singleton.getinstance();
    }
    
}
