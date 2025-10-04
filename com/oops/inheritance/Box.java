package com.oops.inheritance;
//act as superclass
public class Box {
    //instances variable 
    double length;
    double width;
    double height;
    

    //default constructor
    Box(){
        // super();   it must be the very first statement
        this.length = 3;
        this.width = 4;
        this.height = 2;
        //   super();  can't call constructor of the parent class at last
        
    }
    //parametrized const
    Box(double len ,double wid,double heig){
        //initialising
        this.length = len;
        this.width = wid;
        this.height = heig;
    }

    Box (double side) {
       this.length = side;
       this.width = side;
       this.height = side;
    } 

    
    //copy constructor
    Box (Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    public static void main(String[] args) {
       // Box bx1 = new Box();
    }
}
