package com.oops.staticex;
public class Main {
    public static void main(String[] args) {
      Main obj = new Main();
      obj.fun2();
    //    greeting();
    //    fun();showing error
    //     Human aryan = new Human(45,"Aryan katoch");

    //    // System.out.println(aryan.name);
    //     //System.out.println(aryan.age);
    //     Human kunal = new Human(45,"Kunal kushwaha");


    //     System.out.println(Human.pop);
    //     System.out.println(Human.bones);
     }
   //  //static
   //   static void greeting(){
   //      System.out.println("hello ji");
   //   } 
     //non static not access inside main method,only acces by object reference
     void fun(){
        System.out.println("jellon ji");
     }
     void fun2(){
      fun();
     }
}
