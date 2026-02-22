package com.oops.encapsulation;

public class A {
    private int temp;
    int demo;
    protected int or;
    public int cap;

    A(){
        this.temp = 4;
        this.demo = 8;
        this.cap = 11;
        this.or = 83;
    }

    public void setTemp(int temp){
        this.temp = temp;
    }
     public void setDemo(int demo){
        this.demo = demo;
    }
     public void setOr(int or){
        this.or = or;
    }
     public void setCap(int cap){
        this.cap = cap;
    }
    public int getTemp(){
        return temp;
    }
    public int getDemo(){
        return demo;
    }
    public int getOr(){
        return or;
    }
    public int getCap(){
        return cap;
    }
    
    public static void main(String[] args) {
        A obj = new A();
        obj.setTemp(45);
        System.out.println(obj.getTemp());
        obj.setDemo(67);
        System.out.println(obj.getDemo());
        obj.setOr(22);
        System.out.println(obj.getOr());
        obj.setCap(97);
        System.out.println(obj.getCap());

        System.out.println(obj.temp);
        System.out.println(obj.cap);
        System.out.println(obj.or);
        System.out.println(obj.demo);
    }
}
