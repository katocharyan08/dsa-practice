package com.oops.inheritance;


// //act as subclass
public class BoxWeight extends Box {
    double weight ;

    //constructor
    public BoxWeight() {
        super();
        this.weight = 34;
    }
    //parameterized const
    public BoxWeight(double l,double w ,double h,double weight){

        //call parent class constructor using super keyword
        super(l,w,h);//used to initialise values present in the parent class
        this.weight = weight;
    }

    public BoxWeight (double side ,double weight){
        super (side);
        this.weight= weight;
    }    
   
    //copy constructor
    public BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    
}
