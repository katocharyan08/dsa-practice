package com.oops.inheritance;


public class Boxcolor extends BoxWeight  {
    String color;

    public Boxcolor(){
        super();
        this.color = "Grey";
    }
    public Boxcolor(Boxcolor prev){
       super(prev);
       this.color = prev.color;
    }
    public Boxcolor (int length,int width,int height ,int weight , String color){
        super(length , width ,height,weight);
        this.color = color;
    }
    public Boxcolor (int side ,int weight ,String color ){
      super(side,weight);
      this.color = color;

    }

}
