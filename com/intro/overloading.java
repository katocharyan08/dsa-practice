
package com.intro;
public class overloading {
    public static void main(String[] args) {
        int x =23;
        String name = "Sohan";
        fun(x);
        fun(name);

    }
    static void fun(int a){
       System.out.println(a);
    }
    static void fun(String naam){
         System.out.println(naam);
    }
    
}
