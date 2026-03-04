package com.oops.abstraction;

public class Son extends Parent{
	
   public Son(int age) {
		super(age);
	}
   
   //or you can override
   @Override
   void normal() {
	   super.normal();
   }
   @Override
  void career(){
	   System.out.println("I want to become doctor");
  }
   @Override
  void partner() {
	   System.out.println("i love pepper potts");
   }
}
