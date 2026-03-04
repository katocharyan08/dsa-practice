package com.oops.abstraction;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Son son = new Son(30);
         son.career();
         son.partner();
         System.out.println(son.VALUE);
         son.normal();
         //also work as reference type
         //Parent obj = new Daughter();
         Daughter daughter = new Daughter(26);
         daughter.career();
         daughter.partner();
         
         //cannot directly create object
         //Parent mom = new Parent(88);
         //we have to do like this
         Parent mom = new Parent(88) {
         @Override
         void career(){
       	   System.out.println("I want to become mother");
         }
          @Override
         void partner() {
       	   System.out.println("i love pepper potts");
          }
	};
	mom.career();
	Parent.hello();
}
}
