package com.oops.inheritance;



public class Boxprice extends BoxWeight {
    
    double cost ;

    // default constructor
    public  Boxprice (){
        super();
        this.cost = 3;
      }
      //copy constructor
    public  Boxprice(Boxprice other ){
        super(other);
        this.cost = other.cost;
      }
      //parameterized cnstructor
    public  Boxprice (double len,double wid,double hei ,double weig , double cost){
        super(len,wid,hei,weig);//const ke ander ye variables pass krne ka mtlb hai ,
        // ki superclass ka vahi const call hoga jisme ye variable pass hai
        this.cost = cost;
    }
    public Boxprice (double side , double mass ,double cost){
          super(side,mass);
          this.cost = cost;
    }
}
