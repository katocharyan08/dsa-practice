package com.oops.inheritance;


public class Main1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.length);
        Box box2 = new Box(3,5,6);
        System.out.println(box2.height);
        Box box3 = new Box(box2);
        System.out.println(box3.length);

      //  can't access child class variable

      // System.out.println(box3.weight);

        BoxWeight box4 = new BoxWeight();
        //in default const height is accesseable
        System.out.println(box4.height + "," + box4.weight);
        BoxWeight box5 = new BoxWeight(2,4,6,7);
      //  witout using super keyword it not possible to access value of length ,width and height(2,4 & 6 resp)
      //  in parameter case initialise parent class variables
        System.out.println(box5.height);
          

     //  BoxWeight box6 = new box(4,6,8);//can't do this bcoz this calling parent class constructor so can't initialise 
       // child class variable like weight


//the type of refrence variable determines what member can be access 
//but not by the type of object 
 

 Boxprice box7 = new Boxprice(6,10,5);

 Boxprice box8 = new Boxprice(box7);
// System.out.println(box8.mass);
 //for copy cons ,side is 6 ,weight is 10,cost is 5
//  length = 6,width = 6 , height = 6
//  weight = 10
//  cost = 5
// Boxcolor box9 = new Boxcolor(3,5,7,65,Grey);
}

}
