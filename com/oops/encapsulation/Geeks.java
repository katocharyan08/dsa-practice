package com.oops.encapsulation;
//Basic example
 class Programmer  {
    //data hiding
      private String name;
      protected int num;
      public int car;

      Programmer(String name,int num,int car){
         this.name = name;
         this.num = num;
         this.car = car;
      }

     //getter method used to get the private data 
     public String getName(){
        return name;
     }
     //setter method to set or modify the private data
     public void setName(String name){
        this.name = name;
     }
}
//getter and setter methods are not static because they work on instance data,not class data
public class Geeks{
   public static void main(String[] args) {
      Programmer p1 = new Programmer();
      p1.setName("Aryan");
     System.out.println(p1.getName());
     
   }
}