package com.oops.polymorphism;

public class Main {

	public static void main(String[] args) {
		Shapes shape = new Shapes();
		Shapes circle = new Circle();
		Shapes square = new Square();
		Numbers obj = new Numbers();
		System.out.println(obj.sum(43.4,3));
		//shape.area();      
        circle.area();
        //square.area();
	}

}
