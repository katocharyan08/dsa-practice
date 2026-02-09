package com.oops.staticex;

//outside class cannot be static bcoz it did not depend on other class 
//static class Fun{}

//outside cannot be static bcoz didnot depend on other class 
public class Outerclass {
//inner class can be static bcoz it depend on another class
//inside non static class their can be static class
  static class Solarsystem{
         static  String name;
                   public Solarsystem(String name ){
                   this.name = name ;
                 }

           static int sun = 1;
           int stars ; 

            
           //constructor
          Solarsystem(int stars){
           // instance variables call by object reference
            this.stars = stars;
           // static variable call by class reference
            
           }
              
           public static void main(String[] args) {
           Solarsystem obj1 = new Solarsystem("kunal");
            Solarsystem obj2 = new Solarsystem("Aryan");
           System.out.println(obj1.name);//both print aryan because string name is static
            System.out.println(obj2.name);

            System.out.println(Solarsystem.sun);
            System.out.println(obj1.stars);
           }


    }
}

