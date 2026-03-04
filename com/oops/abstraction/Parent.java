package com.oops.abstraction;

public abstract class Parent {
	int age;
	final int VALUE;
	public Parent(int age) {
		this.age = age;
		VALUE = 442;
	}
    abstract void career();
    abstract void partner();
    
    static void hello() {
    System.out.println("hello");
    } 
     void normal() {
    	 System.out.println("normal");
     }
}
