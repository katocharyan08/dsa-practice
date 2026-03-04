package com.oops.abstraction;

public class Daughter extends Parent {
	public Daughter(int age) {
		super(age);
	}
	  @Override
	  void career(){
		   System.out.println("I want to become nurse");
	  }
	   @Override
	  void partner() {
		   System.out.println("i love flowers");
	   }
}
