package com.oops;


public class Main{

    public static void main(String[] args) {
        
       
        Student s1 ;//declaring
        s1 = new Student();  //allocates memory to object of type Student
    
        s1.roll = 45;      
        s1.name = "Aryan katoch";
        s1.marks = 87.6f;



        Student s2 = new Student();
           s2.roll = 34;
           s2.name = "kunal";
           s2.marks = 90f;     

System.out.println("student1");

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);

System.out.println("student2");

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.marks);

       Dog dog1;//declaring
       dog1 = new Dog();//allocates memory to object of type Dog

       dog1.name = "puppy";
       dog1.gender = "male";
System.out.println("my dog");
       System.out.println(dog1.name);
       System.out.println(dog1.gender);



    }
    
  
  }

class Student{
    //instance variable
     int roll ;
     String name ;
     float marks ;
}

class Dog{
     //instance variable
     String name ;
     String gender ;
     
}

